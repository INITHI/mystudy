package com.app

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Parcelable
import android.provider.MediaStore
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageview.setOnClickListener {
            startGallerySelectOrCamera()
        }
    }
    var filePath: String = ""
    fun startGallerySelectOrCamera() {
        try {
            val photoFile = createImageFile()
            photoFile?.run {
                val photoUri = FileProvider.getUriForFile(this@MainActivity,"${BuildConfig.APPLICATION_ID}.provider", this)
                val cameraIntents: MutableList<Intent> = ArrayList()
                val captureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                val packageManager: PackageManager = packageManager
                val listCam = packageManager.queryIntentActivities(captureIntent, 0)
                for (res in listCam) {
                    val packageName = res.activityInfo.packageName
                    val intent = Intent(captureIntent)
                    intent.component = ComponentName(packageName, res.activityInfo.name)
                    intent.setPackage(packageName)
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri)
                    cameraIntents.add(intent)
                }
                val galleryIntent = Intent()
                galleryIntent.type = "image/*"
                galleryIntent.action = Intent.ACTION_GET_CONTENT

                val chooserIntent = Intent.createChooser(galleryIntent, "Select Source")

                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, cameraIntents.toTypedArray<Parcelable>())

                startActivityForResult(chooserIntent,100)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun createImageFile(): File? {
        try {
            val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val image: File = File.createTempFile(imageFileName, ".jpg", storageDir)
            filePath = image.absolutePath
            return image
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(requestCode) {
            100 -> resultProfilePhoto(resultCode, data)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
    fun resultProfilePhoto(resultCode: Int, intent: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            val photo = if(intent == null) getPhotoCamera()
            else getPhotoFile(intent)
            if (photo != null) imageview.setImageBitmap(photo)
        }
    }
    fun getPhotoFile(intent: Intent?): Bitmap? {
        intent?.run {
            val photo = if (Build.VERSION.SDK_INT < 28) {
                MediaStore.Images.Media.getBitmap(contentResolver, data)
            } else {
                ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver,data!!)
                )
            }
            if (photo != null) return photo
        }

        return null
    }

    fun getPhotoCamera(): Bitmap? {

        val file = File(filePath)
        val photo = if (Build.VERSION.SDK_INT < 28) {
            MediaStore.Images.Media.getBitmap(contentResolver, Uri.fromFile(file))
        } else {
            ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver,Uri.fromFile(file)))
        }
        if (photo != null) return photo

        return null
    }
}
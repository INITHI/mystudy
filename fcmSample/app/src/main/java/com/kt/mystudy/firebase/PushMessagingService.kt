package com.kt.mystudy.firebase

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.kt.mystudy.R

class PushMessagingService : FirebaseMessagingService() {

    private val TAG = "Firebase"

    override fun onNewToken(str: String) {
        super.onNewToken(str)
        Log.d(TAG, "PushMessagingService : $str")
    }

    override fun onMessageReceived(remoteMsg: RemoteMessage) {
        Log.d(TAG, "onMessageReceived")
        super.onMessageReceived(remoteMsg)
        remoteMsg?.takeIf { it != null && it.data.isNotEmpty() }?.apply {
            Log.d(TAG, "onMessageReceived - 1")
            sendNotification(this!!)
        }

    }

    private fun sendNotification(remoteMsg: RemoteMessage) {

        remoteMsg.apply {
            val title = data.get("title")
            val message = data.get("message")

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = "채널"
                val channel_nm = "채널명"

                val notichannel = getSystemService(Context.NOTIFICATION_SERVICE) as android.app.NotificationManager
                val channelMessage = NotificationChannel(channel, channel_nm, android.app.NotificationManager.IMPORTANCE_DEFAULT)
                channelMessage.description = "설명"
                channelMessage.enableLights(true)
                channelMessage.enableVibration(true)
                channelMessage.setShowBadge(false)
                channelMessage.vibrationPattern = longArrayOf(100, 200, 100, 200)
                notichannel.createNotificationChannel(channelMessage)

                val notificationBuilder = NotificationCompat.Builder(this@PushMessagingService, channel)
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setContentTitle(title)
                    .setContentText(message)
                    .setChannelId(channel)
                    .setAutoCancel(true)
                    .setDefaults(Notification.DEFAULT_SOUND or Notification.DEFAULT_VIBRATE)

                val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.notify(218, notificationBuilder.build())


            }

        }

    }




}
package com.app

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        //viewpager초기화
        view_pager.adapter = MainPagerAdpater(supportFragmentManager, lifecycle)
        //viewpager 콜백리스너
        view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                val navigation = when(position) {
                    0 -> R.id.navigation_home
                    1 -> R.id.navigation_dashboard
                    2 -> R.id.navigation_notifications
                    else -> R.id.navigation_home
                }
                if(nav_view.selectedItemId != navigation)
                    nav_view.selectedItemId = navigation

            }
        })
        //bottomnavigationview 버튼 리스너
        nav_view.setOnNavigationItemSelectedListener {
            val checked = it.setChecked(true)
            val page = when (checked.itemId) {
                R.id.navigation_home -> {
                    0
                }
                R.id.navigation_dashboard -> {
                    1
                }
                R.id.navigation_notifications -> {
                    2
                }
                else -> 0
            }
            if (page != view_pager.currentItem) {
                view_pager.currentItem = page
            }
            true

        }
    }
}
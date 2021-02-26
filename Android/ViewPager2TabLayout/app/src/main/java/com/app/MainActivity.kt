package com.app

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewpager()
    }

    private fun initViewpager() {
        //viewpager초기화
        view_pager.adapter =
            MainPagerAdpater(
                supportFragmentManager,
                lifecycle
            )
        view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                Log.d("frag", "onPageSelected : $position")
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                Log.d("addon", "onPageScrollStateChanged : $state")
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })
        TabLayoutMediator(layout_tab, view_pager, true, true,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                val textView = TextView(this)
                textView.text = resources.getStringArray(R.array.tabarray)[position]
                tab.text = resources.getStringArray(R.array.tabarray)[position]//customView = textView
            }).attach()

        layout_tab.clearOnTabSelectedListeners()
        layout_tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.d("addon", "onTabReselected : ${tab?.position}")
                //              view_pager.setCurrentItem(tab!!.position, false)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.d("addon", "onTabUnselected : ${tab?.position}")
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.d("addon", "onTabSelected : ${tab?.position}")
                //스크롤 속도를 조절하고 싶을때 코틀린 확장 함수를 만들어 사용함
                if (view_pager.scrollState == ViewPager2.SCROLL_STATE_IDLE) {
                    view_pager.setCurrentItem(tab!!.position, 100)
                }
            }

        })

    }
}
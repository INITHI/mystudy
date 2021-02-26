package com.app

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.ui.dashboard.DashboardFragment
import com.app.ui.home.HomeFragment
import com.app.ui.notifications.NotificationsFragment


class MainPagerAdpater (fm: FragmentManager, lifecycle : Lifecycle) : FragmentStateAdapter(fm, lifecycle) {
    private val count = 3
    override fun getItemCount(): Int {
        return count
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("frag","createFragment : $position")
        return when(position) {
            0-> HomeFragment()
            1-> DashboardFragment()
            2-> NotificationsFragment()
            else -> error("no such")
        }
    }
}
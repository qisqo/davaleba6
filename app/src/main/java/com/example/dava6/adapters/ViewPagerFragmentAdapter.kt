package com.example.dava6.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dava6.R
import com.example.dava6.fragments.FirstFragment
import com.example.dava6.fragments.SecondFragment
import com.example.dava6.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity) :FragmentStateAdapter(activity)  {
    override fun getItemCount()=3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
        else -> FirstFragment()
        }

    }
}
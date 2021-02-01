package com.mushroom.lapo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mushroom.lapo.ui.SettingsFragment
import com.mushroom.lapo.ui.TransactionsFragment
import com.mushroom.lapo.ui.homeFragment


class ScreenAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return when(position){
                0 ->{
                    homeFragment()
                }
                1->{
                    TransactionsFragment()
                }
                2->{
                    SettingsFragment()
                }
                else -> homeFragment()
            }

        }

        override fun getCount(): Int {
            return 3
        }


    }

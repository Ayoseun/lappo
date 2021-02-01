package com.mushroom.lapo.ui

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.mushroom.lapo.R
import com.mushroom.lapo.adapter.ScreenAdapter

class MainScreenActivity : AppCompatActivity() {

    private lateinit var deePager: ViewPager
    private lateinit var Scpager: ScreenAdapter
    lateinit var anims: Animation
    lateinit var anim2: Animation
    lateinit var anim3: Animation
    lateinit var lv3 : ImageView
    lateinit var lv2 : ImageView
    lateinit var lv1 : ImageView
  lateinit var img1 : ImageView
  lateinit var  img2 : ImageView
   lateinit var  img3 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) run {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
            )

        }
  img1 = findViewById<ImageView>(R.id.img1)
         img2 = findViewById<ImageView>(R.id.img2)
         img3 = findViewById<ImageView>(R.id.img3)
        lv1 = findViewById<ImageView>(R.id.lv1)
        lv2 = findViewById<ImageView>(R.id.lv2)
        lv3 = findViewById<ImageView>(R.id.lv3)
     deePager =   findViewById(R.id.deepager)



        Scpager =  ScreenAdapter(supportFragmentManager)
        deePager.adapter= Scpager
     deePager. offscreenPageLimit = 3
      deePager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
          override fun onPageScrollStateChanged(state: Int) {

          }

          override fun onPageScrolled(
              position: Int,
              positionOffset: Float,
              positionOffsetPixels: Int
          ) {

          }

          override fun onPageSelected(position: Int) {
              changingTabs(position)
          }

      })
      //default tab
      deePager.currentItem = 0
      img1.setImageResource(R.drawable.two)

        anims = AnimationUtils.loadAnimation(this,R.anim.stay2)

        anim2 = AnimationUtils.loadAnimation(this,R.anim.zoomin)
    }


    private fun changingTabs(position: Int) {
        if (position == 0) {
            lv3.setImageResource(R.drawable.black_settings_24)
            lv2.setImageResource(R.drawable.black_monetization_on_24)
            img1.setImageResource(R.drawable.two)
            img1.startAnimation(anims)
            lv1.startAnimation(anim2)
            lv1.setImageResource(R.drawable.ic_baseline_home_24)
            img2.setImageResource(R.drawable.one)
            img3.setImageResource(R.drawable.one)

        }
        if (position == 1) {
            lv2.setImageResource(R.drawable.ic_baseline_monetization_on_24)
            lv3.setImageResource(R.drawable.black_settings_24)
            lv1.setImageResource(R.drawable.black_home_24)
            img1.setImageResource(R.drawable.one)
            img2.startAnimation(anims)
            lv2.startAnimation(anim2)
            img2.setImageResource(R.drawable.two)
            img3.setImageResource(R.drawable.one)

        }
        if (position == 2) {
            lv2.setImageResource(R.drawable.black_monetization_on_24)
            lv3.setImageResource(R.drawable.ic_baseline_settings_24)
            lv1.setImageResource(R.drawable.black_home_24)
            img1.setImageResource(R.drawable.one)
            lv3.startAnimation(anim2)
            img2.setImageResource(R.drawable.one)
            img3.startAnimation(anims)
            img3.setImageResource(R.drawable.two)

        }
    }

}

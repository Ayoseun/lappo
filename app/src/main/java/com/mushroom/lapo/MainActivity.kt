package com.mushroom.lapo

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import com.mushroom.lapo.ui.MainScreenActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  prn = findViewById<TextView>(R.id.imageView)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) run {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )

        }

        val  handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }
}
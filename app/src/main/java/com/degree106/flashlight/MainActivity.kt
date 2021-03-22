package com.degree106.flashlight

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var hasFlash: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hasFlash = applicationContext.packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)

        setButton()
    }

    private fun setButton () {
        val button = findViewById(R.id.btn_main) as ImageButton
        button.setOnClickListener{view ->
            Snackbar.make(view, "Hello", Snackbar.LENGTH_SHORT).show()
        }
    }
}
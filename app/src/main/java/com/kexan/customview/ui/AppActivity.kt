package com.kexan.customview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kexan.customview.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<StatsView>(R.id.stats).data = listOf(
            500F,
            500F,
            500F,
            500F,
            100F,
            333F
        )
    }
}
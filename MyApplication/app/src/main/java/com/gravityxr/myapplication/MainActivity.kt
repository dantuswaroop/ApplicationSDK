package com.gravityxr.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gravityxr.mylibrary.AzureSpatialAnchorsActivity
import com.gravityxr.mylibrary.SampleLog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            enterDemo(it)
        }
    }

    fun enterDemo(view: View) {
        startActivity(Intent(applicationContext, AzureSpatialAnchorsActivity::class.java));
//        SampleLog().printLog();
    }
}
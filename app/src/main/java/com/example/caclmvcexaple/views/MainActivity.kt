package com.example.caclmvcexaple.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caclmvcexaple.R
import com.example.caclmvcexaple.controllers.ControllerMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var controllerMainActivity = ControllerMainActivity(this)
    }
}
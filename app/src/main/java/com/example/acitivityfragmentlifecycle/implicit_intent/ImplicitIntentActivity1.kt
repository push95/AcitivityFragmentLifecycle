package com.example.acitivityfragmentlifecycle.implicit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acitivityfragmentlifecycle.R

class ImplicitIntentActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}

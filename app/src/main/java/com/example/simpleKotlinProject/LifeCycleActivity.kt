package com.example.simpleKotlinProject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class LifeCycleActivity : ComponentActivity() {

    companion object {
        val TAG: String = LifeCycleActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Hit")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Hit")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Hit")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Hit")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Hit")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Hit")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: Hit")
    }
}

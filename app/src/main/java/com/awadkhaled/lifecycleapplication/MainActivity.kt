package com.awadkhaled.lifecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

const val LOG_TAG = "Information"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(LOG_TAG,"OnCreate Started")
        Toast.makeText(this,"OnCreate Started",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG,"onStart Started")
        Toast.makeText(this,"onStart Started",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LOG_TAG,"onRestart Started")
        Toast.makeText(this,"onRestart Started",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG,"onResume Started")
        Toast.makeText(this,"onResume Started",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG,"onPause Started")
        Toast.makeText(this,"onPause Started",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG,"onStop Started")
        Toast.makeText(this,"onStop Started",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG,"onDestroy Started")
        Toast.makeText(this,"onDestroy Started",Toast.LENGTH_LONG).show()
    }
}
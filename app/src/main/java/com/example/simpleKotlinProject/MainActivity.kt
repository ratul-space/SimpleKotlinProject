package com.example.simpleKotlinProject

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = "MainActivity"
    }

    private var mLastNames: ListView? = null
    private var mArrayList: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLastNames = findViewById<ListView>(R.id.lstNames)

        if (savedInstanceState == null)
            mArrayList = ArrayList<String>()

        val etName = findViewById<EditText>(R.id.etName)
        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val name = etName.text.toString()


            val lstNames = findViewById<ListView>(R.id.lstNames)

            val arrayList = ArrayList<String>()

            if (name.isNullOrBlank()) {
                mArrayList?.add(name)
                mLastNames?.adapter = ArrayAdapter<String>(
                    applicationContext,
                    android.R.layout.simple_list_item_1,
                    mArrayList
                )
                etName.setText("")
            }
        }
        Log.d(TAG, "onCreate: ends")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: starts")
        super.onSaveInstanceState(outState)

        outState.putStringArrayList(STATE_ARRAY_LIST, mArrayList)
        Log.d(TAG, "onSaveInstanceState: ends")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: starts")
        super.onRestoreInstanceState(savedInstanceState)

        mArrayList = savedInstanceState?.getStringArrayList(STATE_ARRAY_LIST)
        mLastNames?.adapter = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_list_item_1,
            mArrayList
        )

        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: ends")
    }
}
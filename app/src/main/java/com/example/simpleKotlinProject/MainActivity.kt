package com.example.simpleKotlinProject

import android.os.Bundle
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
        val lstNames = findViewById<ListView>(R.id.lstNames)

        val arrayList = ArrayList<String>()

        findViewById<Button>(R.id.btnAdd).setOnClickListener {

//            Log.d(TAG, "onCreate: findViewById<Button>(R.id.btnAdd).setOnClickListener: ${edtname.text.toString()} ")

            val name = etName.text.toString()

            if (name.isNullOrBlank()) {
                arrayList.add(name)
                lstNames.adaptar = ArrayAdapter<String>(
                    applicationContext,
                    android.R.layout.simple_list_item_1,
                    arrayList
                )

                etName.setText("as;dofijasdofijaosdifj")
            }
        }
    }
}
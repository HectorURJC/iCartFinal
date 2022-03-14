package com.example.icartfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) { //The principal function when running.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInfo = findViewById<ImageButton>(R.id.imgBtnInfo)
        val btnNewList = findViewById<Button>(R.id.btnNewList)
        val sw = findViewById<Switch>(R.id.swModoNoche)

        sw.setOnClickListener { //Function of dark mode
            if(sw.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                delegate.applyDayNight()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                delegate.applyDayNight()
            }
        }

        btnInfo.setOnClickListener { //Start running the activity
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

        btnNewList.setOnClickListener { //Create a newList
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}
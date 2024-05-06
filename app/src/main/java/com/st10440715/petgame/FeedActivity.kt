package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed)
        val EatPoints = findViewById<TextView>(R.id.EatPoints)
        EatPointsTextView.text= panda

        var btnEat= findViewById<Button>(R.id.btnEat)
        btnEat.setOnClickListener {
            panda.Eat()
            UpdateStatus()
            private fun updateStatus(){
                var EatPoints= findViewById<TextView>(R.id.EatPoints)
                val status = "Eat:${panda.EatLevel},Play:${panda.Playlevel},Clean:${panda.CleanLeve}"
                EatPoints= Status
        }



}
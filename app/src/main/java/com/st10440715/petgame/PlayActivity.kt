package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PlayActivity : AppCompatActivity() {

    var intPlayPoints: Int = 0
    var intEatPoints: Int = 0
    var intCleanPoints: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play)
        val PlayPoints = findViewById<TextView>(R.id.PlayPoints)
        PlayPointsTextView.text= panda

        val btnEat= findViewById<Button>(R.id.btnEat)
        btnEat.setOnClickListener {
            panda.eat()
            updateStatus()
        }
        val btnPlay= findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener {
            panda.play()
            updateStatus()
        }
        val btnClean= findViewById<Button>(R.id.btnClean)
        btnClean. setOnClickListener {
            panda.clean()
            updateStatus()
        }
        //updateStatus initially updateStatus()

    }
    private fun updateStatus(){
        var PlayPoints= findViewById<TextView>(R.id.PlayPoints)
        val status = "Play:${panda.EatLevel},Play:${panda.Playlevel},Clean:${panda.CleanLeve}"
        PlayPoints= Status

    }    }
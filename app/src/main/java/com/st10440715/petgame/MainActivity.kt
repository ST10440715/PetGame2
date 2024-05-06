package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var eatLevel = 15
    private var playLevel = 20
    private var cleanLevel = 25

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
        }
    }
    fun eat (){
        eatLevel  = 15
        if (eatLevel < 0){
            eatLevel =0
        }
    }
    fun play(){
        playLevel  = 20
        playLevel = 20
        if (playLevel > 0){
            playLevel = 0
        }
    }
    fun clean(){
        cleanLevel = 25
        if (cleanLevel>50){
            cleanLevel = 50
        }
    }
    fun updatestatus(){
        eatLevel = (1..5). random()
        playLevel = (1..5). random()
        cleanLevel = (1..5). random()
    }
}
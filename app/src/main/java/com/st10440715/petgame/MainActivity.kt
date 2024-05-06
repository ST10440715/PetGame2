package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var hungerLevel = 0
    private var happinessLevel =50
    private var energyLevel = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
        }
    }
    fun feed (){
        hungerLevel  = 15
        if (hungerLevel < 0){
            hungerLevel =0
        }
    }
    fun play(){
        happinessLevel  = 20
        energyLevel = 20
        if (energyLevel > 0){
            energyLevel = 0
        }
    }
    fun sleep(){
        energyLevel = 20
        if (energyLevel>50){
            energyLevel = 50
        }
    }
    fun updatestatus(){
        hungerLevel = (1..5). random()
        happinessLevel = (1..5). random()
        energyLevel = (1..5). random()
    }
}
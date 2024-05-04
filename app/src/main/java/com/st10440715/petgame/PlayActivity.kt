package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayActivity : AppCompatActivity() {

    var intPlayPoints: Int = 0
    var intEatPoints: Int = 0
    var intCleanPoints: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play)


        fun PlayPet() {
            imageview:tvPet
            imageview.setImageResource(R.firstImagePlay)
            val btnPlay = findViewById<Button>(R.id.btnPlay)
            btnPlay.setOnClickListener {
                PlayPet()
                intPlayPoints = 10
                UpdateStatus()
            }
        }

        fun FeedPet() {
            val btnEat = findViewById<Button>(R.id.btnEat)
            btnEat.setOnClickListener {
                FeedPet()
                intEatPoints = 15
            }
        }

        fun CleanPet() {
            val btnClean = findViewById<Button>(R.id.btnClean)
            btnClean.setOnClickListener {
                CleanPet()
                intCleanPoints = 20

            }
        }

    }
}
package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed)

        fun PlayPet() {

            imageview.setImageResource(R.firstImagePlay)
            val btnPlay = findViewById<Button>(R.id.btnPlay)
            btnPlay.setOnClickListener {
                PlayPet()
                intPlayPoints = 10
                UpdateStatus()
            }
            if (intPlayPloint <= 10 || intEatPoints  )
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
}
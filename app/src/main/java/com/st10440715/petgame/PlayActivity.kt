package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PlayActivity : AppCompatActivity() {

    var intPlayPoints: Int = 15
    var intEatPoints: Int = 20
    var intCleanPoints: Int = 25

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play)
        findViewById<TextView>(R.id.PlayPoints)
        val btnPlay= findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener {
            pandaPLay()
        }
        fun updateStatus(){
            var playLevel = (1..15). random()
            val statusText = this.findViewById<TextView>(R.id.pandaPlay)
            val panda = null
            val status = getString(R.string.pandaplay)

        }        }
    private fun pandaPLay(){
         TODO("panda is playing")

    }
}


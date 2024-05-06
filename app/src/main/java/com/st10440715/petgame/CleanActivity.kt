package com.st10440715.petgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class CleanActivity : AppCompatActivity() {
    var intPlayPoints: Int = 15
    var intEatPoints: Int = 20
    var intCleanPoints: Int = 25

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.clean)
        findViewById<TextView>(R.id.CleanPoints)
        val btnClean= findViewById<Button>(R.id.btnClean)
        btnClean.setOnClickListener {
            pandaClean()
        }
        fun updateStatus(){
            var cleanLevel = (1..25). random()
            val statusText= this.findViewById<TextView>(R.id.pandaClean)
            val panda = null
            val status = getString(R.string.cleanliness_play, )

        }        }

    private fun pandaClean() {
        TODO("Panda is cleaning")
    }
}
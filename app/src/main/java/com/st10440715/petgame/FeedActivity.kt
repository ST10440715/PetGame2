package com.st10440715.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FeedActivity : AppCompatActivity() {
    var intPlayPoints: Int = 15
    var intEatPoints: Int = 20
    var intCleanPoints: Int = 25

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed)
        findViewById<TextView>(R.id.EatPoints)
        val btnEat = findViewById<Button>(R.id.btnEat)
        btnEat.setOnClickListener {
            pandaEat()
        }
        fun updateStatus(){
            var eatLevel = (1..15).random()
            val statusText = this.findViewById<TextView>(R.id.pandaEat)
            val panda =  null
            val status = getString(R.string.pandaEat)

        }        }


    private fun pandaEat(){
        // TODO("panda is eating")
    }
}
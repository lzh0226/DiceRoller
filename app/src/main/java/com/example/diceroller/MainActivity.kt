package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        //buttonCount.setOnClickListener{ countUp() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"
        //resultText.text = randomInt.toString()
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
    /*private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/
}

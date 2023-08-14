package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            /*
            val toast = Toast.makeText(this, "Let's go!", Toast.LENGTH_SHORT)
            toast.show()
            */
            rollDice()
            /*
            val resultTextView: TextView= findViewById(R.id.textView3)
            resultTextView.text="6"
            */
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val rolls = dice.roll()

        //val resultTextView: TextView = findViewById(R.id.textView3)
        val diceImage: ImageView = findViewById(R.id.imageView2)
        when (rolls){
            3-> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 -> diceImage.setImageResource(R.drawable.dice_5)
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        6 -> diceImage.setImageResource(R.drawable.dice_6)
        2 -> diceImage.setImageResource(R.drawable.dice_2)
    }}
}


class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}
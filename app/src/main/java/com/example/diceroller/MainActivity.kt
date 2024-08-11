package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            //Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show()
            diceRoll()
        }
    }

    private fun diceRoll() {
        val randomInt = Random().nextInt(7)
        binding.text.text = randomInt.toString()
        val drawable = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else->
                R.drawable.empty_dice
        }

        binding.imageView.setImageResource(drawable)
        }
    }

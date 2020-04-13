package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chiniise","Pizza","Burgers", "Dessert", "Hotdogs", "Mamas food")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener{
           // println("clickkk me nigaaaaaa")
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodtext.text= foodList[randomFood]
        }

        addFoodBtn.setOnClickListener{

            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
        }
    }
}

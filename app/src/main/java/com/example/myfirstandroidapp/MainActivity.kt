package com.example.myfirstandroidapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = "e"
        val sortedList =
            listOf("Samy", "Victor", "Guillaume", "Mel", "Bastien").sortedBy { it.length }

        sortedList.forEach { name ->
            Log.d(null, name)
        }

        list_textview.text = sortedList.joinToString() //

        tryme_button.setOnClickListener {
            hello_esiee.text = "${hello_esiee.text}$str"
            //val randomIndex = Random.nextInt(sortedList.size)
            val rand = sortedList.random()
            list_textview.text = rand
        }


    }



}

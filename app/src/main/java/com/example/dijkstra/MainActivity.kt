package com.example.dijkstra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val StartNumber = findViewById<EditText>(R.id.StartNumber)
        val EndNumber = findViewById<EditText>(R.id.EndNumber)
        var StartButton= findViewById<Button>(R.id.StartButton)

        StartNumber.setText("1")
        EndNumber.setText("10")


        StartButton.setOnClickListener{
                val toast = Toast.makeText(applicationContext, "Button Pressed", Toast.LENGTH_SHORT)
                toast.show()

        }



    }

}
package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonSendClick(view: View) {
        val name: TextView = findViewById(R.id.editTextName)
        val yearOfBirthText: TextView = findViewById(R.id.editTextYear)
        val monthOfBirthText: TextView = findViewById(R.id.editTextMonth)
        val dogName = name.text.toString()
        val year = yearOfBirthText.text.toString()
        val month = monthOfBirthText.text.toString()
        val dog : SecondActivity.dog = SecondActivity.dog (month, year, dogName)
        val intent: Intent = Intent(
            this@MainActivity,
            SecondActivity::class.java)
        intent.putExtra(dog.javaClass.simpleName, dog)
        when (view.id){
            R.id.buttonSave -> startActivity(intent)
        }
}
}
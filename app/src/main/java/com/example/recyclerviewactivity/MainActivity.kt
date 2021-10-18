package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go(view: android.view.View) {
        val firstName=edFirstName.text.toString()
        val lastName=edLastName.text.toString()
        val location=edLocation.text.toString()
        val phone=edPhone.text.toString()
        var intent=Intent(applicationContext,SecondPage::class.java)
        intent.putExtra("firstName",firstName)
        intent.putExtra("lastName",lastName)
        intent.putExtra("location",location)
        intent.putExtra("phone",phone)
        startActivity(intent)
    }
}
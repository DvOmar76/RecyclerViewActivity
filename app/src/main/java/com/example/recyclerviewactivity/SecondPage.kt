package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rvadapter.*
import kotlinx.android.synthetic.main.item_row.*

class SecondPage : AppCompatActivity() {
    val info=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rvadapter)
//        val firstName=intent.getStringExtra("firstName").toString()
//        val lastName=intent.getStringExtra("lastName").toString()
//        val location= intent.getStringExtra("location")
//        val phone= intent.getStringExtra("phone")
        info.add(intent.getStringExtra("firstName").toString())
        info.add(intent.getStringExtra("lastName").toString())
        info.add(intent.getStringExtra("location").toString())
        info.add(intent.getStringExtra("phone").toString())
        recyclerView.adapter=RVAdapter(info)
        recyclerView.layoutManager=LinearLayoutManager(this)
    }

}
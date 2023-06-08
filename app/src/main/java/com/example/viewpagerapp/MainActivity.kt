package com.example.viewpagerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.Adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter:MyAdapter
    private val arrayList=ArrayList<String>()
    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager=findViewById(R.id.viewpager)
        myAdapter=MyAdapter(this)
        viewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter=myAdapter
    }
}
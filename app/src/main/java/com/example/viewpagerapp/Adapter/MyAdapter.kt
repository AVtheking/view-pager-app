package com.example.viewpagerapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragment.FragmentOne
import com.example.viewpagerapp.fragment.Fragmentthree
import com.example.viewpagerapp.fragment.Fragmenttwo

class MyAdapter(mainActivity: MainActivity):FragmentStateAdapter(mainActivity) {
    private val Fragment_size=3
    override fun getItemCount(): Int {
        return this.Fragment_size
    }

    override fun createFragment(position: Int): Fragment {
      when(position)
      {
          0->{
              return FragmentOne()
          }
          1->{
              return Fragmenttwo()
          }
          2->
              return Fragmentthree()
      }
        return FragmentOne()
    }
}
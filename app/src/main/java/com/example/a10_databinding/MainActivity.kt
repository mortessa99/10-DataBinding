package com.example.a10_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.a10_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("Mortessa","Jahanbakhsh")
        binding.btnUpdate.setOnClickListener {
            binding.user = User("ABCDEFGH","IJKLMNOP")
        }
    }
}

data class User(var name:String , var family:String)
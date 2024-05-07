package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Menggunakan binding untuk mengakses TextView
        binding.textView.text = "Hello kami kelompok 1"
        binding.button.setOnClickListener { userClicked() }
    }
        private fun userClicked() {
        }
    }

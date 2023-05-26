package com.uaspm1.soundchecker.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.fragment.Utamafragment
import com.uaspm1.soundchecker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ganti fragment utama setelah splash screen selesai
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment1, Utamafragment())
        fragmentTransaction.commit()


    }
}


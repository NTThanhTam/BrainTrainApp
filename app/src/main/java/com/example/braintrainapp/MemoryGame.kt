package com.example.braintrainapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.braintrainapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MemoryGame : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memory_game)
        val memoryHome: Button = findViewById(R.id.MemoryHome);
        memoryHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
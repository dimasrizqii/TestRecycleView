package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listGame = arrayListOf(
            MyGame("Genshin Impact","Hoyoverse", R.drawable.ic_genshin_impact),
            MyGame("Dota 2", "Valve", R.drawable.ic_dota_2),
            MyGame("Honkai Impact 3rd", "Hoyoverse", R.drawable.ic_hi_3)
        )

        val adapter = GameAdapter(listGame)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
    }
}
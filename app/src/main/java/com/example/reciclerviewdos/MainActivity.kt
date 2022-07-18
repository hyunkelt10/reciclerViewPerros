package com.example.reciclerviewdos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reciclerviewdos.adapter.PerrosAdapter
import com.example.reciclerviewdos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initRecyclerView()

    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.reciclerPerros.layoutManager = manager
        b.reciclerPerros.addItemDecoration(decoration)
        b.reciclerPerros.layoutManager = LinearLayoutManager(this)
        b.reciclerPerros.adapter = PerrosAdapter(PerrosProvider.perrosLista)

    }




}
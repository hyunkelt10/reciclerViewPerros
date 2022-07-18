package com.example.reciclerviewdos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewdos.Perros
import com.example.reciclerviewdos.R

class PerrosAdapter (private val perrosList: List<Perros>) : RecyclerView.Adapter<PerrosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerrosViewHolder {
        // En vez de tener que recojer el contexto como parámetro lo puedo
        // coger de cualquiera de las vistas del layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return PerrosViewHolder(layoutInflater.inflate(R.layout.item_perros, parent, false))
    }

    override fun onBindViewHolder(holder: PerrosViewHolder, position: Int) {
        val item = perrosList[position]
        holder.render(item)
    }

    //Devuelve el tamaño de la lista
    override fun getItemCount(): Int = perrosList.size
}




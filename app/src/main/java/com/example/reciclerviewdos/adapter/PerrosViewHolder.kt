package com.example.reciclerviewdos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewdos.Perros
import com.example.reciclerviewdos.R
import com.example.reciclerviewdos.databinding.ItemPerrosBinding

class PerrosViewHolder (view: View): RecyclerView.ViewHolder(view) {

    val b = ItemPerrosBinding.bind(view)
    fun render(PerrosModel: Perros) {
        b.tvRaza.text = PerrosModel.raza
        b.tvNombre.text = PerrosModel.nombre
        Glide.with(b.ivPerro.context)
            .load(PerrosModel.foto)
            .error(R.drawable.ic_launcher_foreground)
            .into(b.ivPerro)
        b.tvEdad.text = "Edad: ".plus(PerrosModel.edad.toString()).plus(" años")
        b.tvSexo.text = if (PerrosModel.sexo) {
            "sexo: Macho"
        } else {
            "sexo: Hembra"
        }
        b.tvEsterilizado.text = if (PerrosModel.esterilizado) {
            "Esterilizado: Si"
        } else {
            "Esterilizado: No"
        }



    }


}

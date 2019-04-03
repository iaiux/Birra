package com.example.birra

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.birra.datamodel.Birra

class BirraAdapter(val dataset: ArrayList<Birra>, val context: Context) : RecyclerView.Adapter<riga_viewholder>() {

    // Invocata per creare un ViewHolder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): riga_viewholder {
        // Crea e restituisce un viewholder, effettuando l'inflate del layout relativo alla riga
        return riga_viewholder(LayoutInflater.from(context).inflate(R.layout.riga_layout, viewGroup, false))
    }

    // Invocata per conoscere quanti elementi contiene il dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Invocata per visualizzare all'interno del ViewHolder il dato corrispondente alla riga
    override fun onBindViewHolder(viewHolder: riga_viewholder, position: Int) {
        val birra = dataset.get(position)

        viewHolder.tvNome.text = birra.nome
        viewHolder.tvGradazione.text = birra.gradazione.toString()
    }
}
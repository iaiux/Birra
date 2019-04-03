package com.example.birra

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.riga_layout.view.*

class riga_viewholder (view: View) : RecyclerView.ViewHolder(view) {

        val tvNome = view.nome_view
        val tvGradazione = view.gradazione_view
    }

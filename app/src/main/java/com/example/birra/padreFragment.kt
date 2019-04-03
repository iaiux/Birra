package com.example.birra

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.birra.datamodel.Database
import kotlinx.android.synthetic.main.fragment_padre.*


class padreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_padre, container, false)
    }


override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Imposto il layout manager a lineare per avere scrolling in una direzione
    listaBirre.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
    listaBirre.adapter = BirraAdapter(Database.getElencoBirre(), requireContext())
    }

}

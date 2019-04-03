package com.example.birra.datamodel

object Database {


    private var birre = ArrayList<Birra>()

    // Inizializzatore per popolare il database con qualche dato
    init {
        birre.add(Birra("Blonde", 6.6f))
        birre.add(Birra("La Biere du Demon", 12f))
        birre.add(Birra("BrewMaster's Choice IPA", 5.8f))
        birre.add(Birra("Blonde", 6.6f))
        birre.add(Birra("La Biere du Demon", 12f))
        birre.add(Birra("BrewMaster's Choice IPA", 5.8f))
        birre.add(Birra("Blonde", 6.6f))
        birre.add(Birra("La Biere du Demon", 12f))
        birre.add(Birra("BrewMaster's Choice IPA", 5.8f))
    }

    // Restituisce l'elenco di tutte le birre presenti lo uso perché l'oggetto è privato
    // per cui ho bisogno di get
    fun getElencoBirre(): ArrayList<Birra> { // dopo i due punti c'è il tipo di ritorno infatti
        //restituisco return birre che è un tipo array

        return birre

    }
}
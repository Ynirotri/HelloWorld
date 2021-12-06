package com.ynirotri.dccomics.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.ynirotri.dccomics.R
import com.ynirotri.dccomics.databinding.FragmentListBinding
import com.ynirotri.dccomics.model.Superheroe
import com.ynirotri.dccomics.model.SuperheroeItem

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private lateinit var superHeroesAdapter: SuperHeroesAdapter
    private lateinit var listSuperheroes: ArrayList<SuperheroeItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listSuperheroes = loadMockSuperHeroesFromJson()
        superHeroesAdapter = SuperHeroesAdapter(listSuperheroes, onItemClicked = {onSuperheroeClicked(it)})

    }

    private fun onSuperheroeClicked(superheroe: SuperheroeItem) {

    }


    private fun loadMockSuperHeroesFromJson(): ArrayList<SuperheroeItem> {
        val superHeroesString: String = context?.assets?.open("superheroes.json")?.bufferedReader()
            .use { it!!.readText() } //TODO reparar!!
        val gson = Gson()
        val superHeroesList = gson.fromJson(superHeroesString, Superheroe::class.java)
        return superHeroesList
    }




}
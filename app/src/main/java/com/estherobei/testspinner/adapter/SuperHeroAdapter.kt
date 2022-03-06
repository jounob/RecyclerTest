package com.estherobei.testspinner.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.estherobei.testspinner.R
import com.estherobei.testspinner.SuperHero

class SuperHeroAdapter(private val superHeroList: List<SuperHero>):
    RecyclerView.Adapter<SuperHeroViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_super_hero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.render(superHeroList[position])

    }

    override fun getItemCount(): Int = superHeroList.size
}
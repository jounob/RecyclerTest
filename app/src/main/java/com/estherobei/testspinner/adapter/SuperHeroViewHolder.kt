package com.estherobei.testspinner.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.estherobei.testspinner.SuperHero
import com.estherobei.testspinner.databinding.ItemSuperHeroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperHeroBinding.bind(view)

   fun render(superHeroModel: SuperHero){
//        binding.tvHeroName.text = superHeroModel.superHero
//        binding.tvRealName.text = superHeroModel.realName
//        binding.tvPublisher.text = superHeroModel.publisher

            Glide.with(binding.ivPhoto.context).load(superHeroModel.photo).into(binding.ivPhoto)
    }
}
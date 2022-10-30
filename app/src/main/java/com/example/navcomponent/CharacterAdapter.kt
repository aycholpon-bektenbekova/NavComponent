package com.example.navcomponent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navcomponent.databinding.ItemCharactersBinding
import kotlin.reflect.KFunction0

class CharacterAdapter(
    val characterList: List<Character>,
    val onClick: (position: Int) ->Unit

): RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
       holder.bind()
    }

    override fun getItemCount() = characterList.size

    inner class CharacterViewHolder(private val binding: ItemCharactersBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(){
            val item = characterList[adapterPosition]
            Glide.with(binding.characterPicture)

        }
    }
}
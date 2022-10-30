package com.example.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navcomponent.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val characterList = arrayListOf<Character>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
          binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()

        val adapter = CharacterAdapter(characterList, this::onClick)
        binding.rvCharacter.adapter = adapter

    }

    private fun loadData() {
       characterList.add(Character("Alaska Young","https://everloved.com/media/photos/deceased-photos/215c20e8-f3be-4c94-bcdf-7e32354fad46.trimmed.png"))
       characterList.add(Character("Takumi Hikohito", "https://static1.personality-database.com/profile_images/189f683934fc48df8dd711dff52aed83.png"))
       characterList.add(Character("Lara Buterskaya",  "https://static1.personality-database.com/profile_images/31108d526bda47858ed8c8e8273458ab.png"))
       characterList.add(Character("Chip Martin", "https://www.denofgeek.com/wp-content/uploads/2019/10/looking-for-alaska-denny-love-chip-the-colonel-scaled.jpg?fit=2560%2C1707"))
       characterList.add(Character("Miles Halter", "https://media1.popsugar-assets.com/files/thumbor/_UXE2OX8KL6VhpWK6pQUHRDntKI/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2019/11/04/872/n/1922564/e4c3714b87525122_LFA_104_AB_00502RC_f/i/Charlie-Plummer-as-Miles-Halter-in-Looking-For-Alaska.jpg"))
       characterList.add(Character("Kevin Richman", "https://data.whicdn.com/images/345655623/original.png"))
       characterList.add(Character("Hank Walston", ""))
       characterList.add(Character("Jake", "https://static1.personality-database.com/profile_images/b124786a91d1465794e982d8bfcaf509.png"))
       characterList.add(Character("Sara", "https://static1.personality-database.com/profile_images/1b8b6422257c455abc963a930e73270b.png"))
       characterList.add(Character("Dolores Martin", "https://static1.personality-database.com/profile_images/da58ab3d78b14e5d81620fc99c2d802d.png"))
    }

    fun onClick(position: Int) {

        findNavController().navigate(R.id.detailFragment, bundleOf("key" to characterList[position]))
    }
}
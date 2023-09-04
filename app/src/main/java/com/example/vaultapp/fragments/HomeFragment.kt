package com.example.vaultapp.fragments


import androidx.navigation.fragment.findNavController
import com.example.vaultapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.vaultapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNotes.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_notesHomeFragment)
        }

       binding.btnALbum.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_albumFragment)
        }



               binding.btnPrivateBrowser.setOnClickListener {
                   findNavController().navigate(R.id.action_homeFragment_to_privateBrowserFragment)
               }

               binding.btnTick.setOnClickListener {

               }
    }
}

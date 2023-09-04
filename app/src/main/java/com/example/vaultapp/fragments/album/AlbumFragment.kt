package com.example.vaultapp.fragments.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.databinding.FragmentAlbumBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlbumFragment : Fragment() {

    private lateinit var binding: FragmentAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlbumBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivGoHome.setOnClickListener {

            val action = AlbumFragmentDirections.actionAlbumFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        binding.ivAddAlbum.setOnClickListener {

            val action = AlbumFragmentDirections.actionAlbumFragmentToAlbumAddFragment()
            findNavController().navigate(action)
        }
    }
}

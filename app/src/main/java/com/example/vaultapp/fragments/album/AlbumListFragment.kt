package com.example.vaultapp.fragments.album

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentAlbumListBinding
import com.example.vaultapp.models.AlbumViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlbumListFragment : Fragment(R.layout.fragment_album_list) {
    private lateinit var binding: FragmentAlbumListBinding
    private val viewModel: AlbumViewModel by viewModels()
    private val albumAdapter = AlbumAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAlbumListBinding.bind(view)

        binding.albumRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = albumAdapter
        }

        viewModel.allAlbums.observe(viewLifecycleOwner) { albums ->
            albums?.let {
                albumAdapter.submitList(albums)
            }
        }
    }
}

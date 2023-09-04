package com.example.vaultapp.fragments.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.databinding.FragmentAlbumAddBinding
import com.example.vaultapp.models.AlbumViewModel
import com.example.vaultapp.mvvm.Album
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlbumAddFragment : Fragment() {

    private val viewModel: AlbumViewModel by viewModels()
    private lateinit var binding: FragmentAlbumAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumAddBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCancel.setOnClickListener {
            // İptal düğmesine tıklanıldığında geri dönülebilir.
            findNavController().popBackStack()
        }

        binding.btnSave.setOnClickListener {
            // Save düğmesine tıklanıldığında, albüm eklemeyi ve ardından albüm listesine dönmeyi yapabilirsiniz.
            val albumName = binding.etAlbumName.text.toString()
            if (albumName != ""){
                addAlbum(albumName)
            }else{

            }
        }
    }

    // Albüm eklemek ve kaydetmek için kullanılacak fonksiyon
    private fun addAlbum(albumName: String) {
        // Albüm adı boş değilse
        if (albumName != "") {
            val newAlbum = Album(name = albumName)
            viewModel.insert(newAlbum) // Albümü veritabanına ekleyin
            findNavController().popBackStack() // Geri dön
        }
    }
}

package com.example.vaultapp.fragments.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vaultapp.R
import com.example.vaultapp.data.Note
import com.example.vaultapp.databinding.FragmentNotesBinding
import com.example.vaultapp.models.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NotesFragment : Fragment() {

    private lateinit var binding: FragmentNotesBinding
    private lateinit var noteViewModel: NoteViewModel
    private lateinit var noteAdapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        noteViewModel = ViewModelProvider(this)[NoteViewModel::class.java]

        noteAdapter = NoteAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = noteAdapter

        binding.btnCancel.setOnClickListener {
            // İptal butonu tıklandığında not eklemeyi iptal etmek için
            clearFields()
        }

        binding.btnSave.setOnClickListener {
            val title = binding.editTitle.text.toString()
            val content = binding.editContent.text.toString()

            if (title.isNotEmpty() && content.isNotEmpty()) {
                val note = Note(title = title, content = content)
                CoroutineScope(Dispatchers.Main).launch {
                    noteViewModel.insert(note)
                }
                clearFields()
                // Geri dönmek için bu kodu kullanabilirsiniz:
                findNavController().navigate(R.id.action_notesFragment_to_notesHomeFragment)
            } else {
                // Eksik giriş alanları için bir hata mesajı gösterin
                Toast.makeText(requireContext(), "Başlık ve içerik alanları doldurulmalıdır", Toast.LENGTH_SHORT).show()
            }
        }

       /* noteViewModel.allNotes().observe(viewLifecycleOwner) { notes ->
            noteAdapter.submitList(notes)
        }*/
    }

    private fun clearFields() {
        binding.editTitle.text.clear()
        binding.editContent.text.clear()
    }
}

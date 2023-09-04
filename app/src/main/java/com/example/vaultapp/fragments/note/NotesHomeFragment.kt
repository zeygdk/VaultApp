package com.example.vaultapp.fragments.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentNotesHomeBinding


class NotesHomeFragment : Fragment() {
    private var binding: FragmentNotesHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotesHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnNotes?.setOnClickListener {
            // btnNotes tıklandığında NotesFragment'e geçiş yap
            findNavController().navigate(R.id.action_notesHomeFragment_to_notesFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

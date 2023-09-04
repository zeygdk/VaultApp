package com.example.vaultapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentBiometricBinding
import com.example.vaultapp.databinding.FragmentInAppBinding


class InAppFragment : Fragment() {
    private lateinit var binding: FragmentInAppBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentInAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // View Binding ile oluşturulan bağlama sınıfını kullanarak görünümlere erişin
        binding.startButton.setOnClickListener {
            // Start düğmesine tıklandığında HomeFragment'a git
            findNavController().navigate(R.id.action_inAppFragment_to_homeFragment)
        }
    }
}

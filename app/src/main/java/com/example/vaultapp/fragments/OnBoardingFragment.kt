package com.example.vaultapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentOnBoardingBinding


class OnBoardingFragment : Fragment(R.layout.fragment_on_boarding) {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setImageResource(R.drawable.img_onboarding1)
        binding.textView.text = "Lock Private Items"
        binding.textView2.text =
            "Safely store your private photos, videos, passwords, credit card information and notes in this app."

        binding.button.setOnClickListener {

            findNavController().navigate(R.id.action_onBoardingFragment_to_onBoarding2Fragment4)
        }
    }
}

package com.example.vaultapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentOnBoarding2Binding


class OnBoarding2Fragment : Fragment(R.layout.fragment_on_boarding2) {

    private lateinit var binding: FragmentOnBoarding2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoarding2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setImageResource(R.drawable.img_onboarding2)
        binding.textView.text = "Browser Secretly"
        binding.textView2.text =
            "With Private browser, you can surf the Internet privately and your browser history never saved."

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_onBoarding2Fragment4_to_inAppFragment)
        }
    }
}

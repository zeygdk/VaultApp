package com.example.vaultapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vaultapp.R
import com.example.vaultapp.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {
    private lateinit var binding: FragmentPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPasswordBinding.inflate(inflater, container, false)

        binding.passwordButton.setOnClickListener {
            val enteredPassword = binding.passwordEditText.text.toString()
            if (isPasswordValid(enteredPassword)) {
                // Parola doğrulama başarılı, başka bir fragmente yönlendirme yapabilirsiniz.
                findNavController().navigate(R.id.action_passwordFragment_to_onBoardingFragment)
            } else {
                // Parola doğrulama başarısız, hata mesajı gösterilebilir.
                Toast.makeText(requireContext(), "Parola geçersiz!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    private fun isPasswordValid(enteredPassword: String): Boolean {
        // Gerçek bir parola doğrulama mantığı burada uygulanmalıdır.
        // Örnek olarak, basit bir parola "123456" olarak kabul edilir.
        return enteredPassword == "123456"
    }
}


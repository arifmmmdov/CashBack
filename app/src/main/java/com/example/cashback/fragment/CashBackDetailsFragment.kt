package com.example.cashback.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cashback.databinding.FragmentCashBackDetailsBinding

class CashBackDetailsFragment : Fragment() {
    private val binding by lazy {
        FragmentCashBackDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        setListeners()
        return binding.root
    }

    private fun setListeners() {
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

}
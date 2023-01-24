package com.example.recyclerview.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.recyclerview.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val imageResource = requireArguments().getInt("imageResource", 0)
        val priceResource = requireArguments().getInt("priceResource", 0)
        val name = requireArguments().getString("name", "not found")

        binding.detailVacationImage.setImageResource(imageResource)
        binding.detailPriceText.text = getString(priceResource)
        binding.detailNameText.text = name

        binding.detailBookButton.setOnClickListener {
            Toast.makeText(requireContext(),"Booking Confirmed.", Toast.LENGTH_SHORT)
                .show()
        }
    }
}

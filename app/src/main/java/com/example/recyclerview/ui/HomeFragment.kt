package com.example.recyclerview.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerview.adapter.VacationAdapter
import com.example.recyclerview.data.Datasource
import com.example.recyclerview.databinding.FragmentHomeBinding

class HomeFragment : Fragment () {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val datasource = Datasource()

        val vacationList = datasource.getVacations()

        binding.homeVacationRecycler.adapter = VacationAdapter(requireContext(),vacationList)

    }
}
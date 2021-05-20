package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.skica.databinding.PreprekaPronadjenaBinding
import kotlin.system.exitProcess


class PreprekaPronadjenaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<PreprekaPronadjenaBinding>(inflater, R.layout.prepreka_pronadjena, container, false)

        binding.preprekaPronadjenaDugmePocetna.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_preprekaPronadjenaFragment_to_pocetnaFragment)
        }

        binding.preprekaPronadjenaDugmeIzlaz.setOnClickListener{ view: View ->
            exitProcess(0)
        }

        return binding.root
    }


}
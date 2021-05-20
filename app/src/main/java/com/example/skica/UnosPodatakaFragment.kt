package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.skica.databinding.UnosPodatakaBinding
import androidx.navigation.fragment.findNavController

import kotlinx.android.synthetic.main.unos_podataka.*
import com.example.skica.UnosPodatakaFragmentDirections.Companion as UnosPodatakaFragmentDirections


class UnosPodatakaFragment : Fragment(R.layout.unos_podataka) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToPrioritetiFromUnos()

    }


    private fun goToPrioritetiFromUnos(){
        unos_podataka_dugme_dalje.setOnClickListener {
            val ime = unos_podataka_ime.text.toString()
            val prezime = unos_podataka_prezime.text.toString()
            val datum_rodenja = unos_podataka_datum_rodjenja.text.toString()
            val jmbg = unos_podataka_jmbg.text.toString()
            val broj_tel = unos_podataka_telefon.text.toString()

            val action =  UnosPodatakaFragmentDirections.actionUnosPodatakaFragmentToPrioritetiFragment2(
                ime, prezime, datum_rodenja, jmbg, broj_tel
            )
            findNavController().navigate(action)


        }

    }



}
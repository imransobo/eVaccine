package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.skica.databinding.ProvjeraPreprekeBinding
import com.example.skica.databinding.SazetakPodatakaBinding
import kotlinx.android.synthetic.main.sazetak_podataka.*

class  SazetakPodatakaFragment : Fragment(R.layout.sazetak_podataka) {

    private val args: SazetakPodatakaFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val ime = "Ime: ${args.ime}"
        val prezime = "Prezime: ${args.prezime}"
        val datum_rodenja = "Datum rođenja: ${args.datumRodenja}"
        val broj_tel = "Broj telefona: ${args.brojTelefona}"
        val jmbg = "JMBG: ${args.jmbg}"
        val vakcina = "Vakcina: ${args.vrstaVakcine}"

        sazetak_podataka_ime_prezime.text = ime
        sazetak_podataka_jmbg.text = prezime
        sazetak_podataka_godine.text = datum_rodenja
        sazetak_podataka_telefon.text = broj_tel
        sazetak_podataka_ime_prezime2.text = jmbg
        sazetak_pod_vakcina.text = vakcina


        goToTerminFromIzbor()




    }

    private fun goToTerminFromIzbor(){
        sazetak_podataka_dugme_dalje.setOnClickListener {
            val action = SazetakPodatakaFragmentDirections.actionSazetakPodatakaFragmentToTerminVakcinacijeFragment()
            findNavController().navigate(action)
        }
    }









}
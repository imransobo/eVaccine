package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.prioriteti.*
import kotlinx.android.synthetic.main.sazetak_podataka.*


class PrioritetiFragment : Fragment(R.layout.prioriteti) {
    private val args: PrioritetiFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onRadioButtonClicked(view)

    }



    fun onRadioButtonClicked(view: View) {

        var prioritetnaGrupa = ""

        if (view is RadioButton) {

            val checked = view.isChecked

            when (view.getId()) {
                R.id.prioriteti_medicinski_radnik ->
                    if (checked) {
                        prioritetnaGrupa += prioriteti_medicinski_radnik.text.toString()
                    }
                R.id.prioriteti_hronicni_bolesnik ->
                    if (checked) {
                        prioritetnaGrupa += prioriteti_hronicni_bolesnik.text.toString()
                    }
                R.id.prioriteti_boravak_ugrozeni ->
                    if (checked) {
                        prioritetnaGrupa += prioriteti_boravak_ugrozeni.text.toString()
                    }
                R.id.prioriteti_starije_lice ->
                    if (checked) {
                        prioritetnaGrupa += prioriteti_starije_lice.text.toString()
                    }
                R.id.prioriteti_ne_pripadam ->
                    if (checked) {
                        prioritetnaGrupa += prioriteti_ne_pripadam.text.toString()
                    }
            }
        }



        prioriteti_dugme_dalje.setOnClickListener {
            val ime = args.ime
            val prezime = args.prezime
            val datum_rodenja = args.datumRodenja
            val broj_tel = args.brojTelefona
            val jmbg = args.jmbg



            val action = PrioritetiFragmentDirections.actionPrioritetiFragmentToIzborVakcineFragment(
                ime, prezime, datum_rodenja, broj_tel, jmbg
            )
            findNavController().navigate(action)
        }



    }












}



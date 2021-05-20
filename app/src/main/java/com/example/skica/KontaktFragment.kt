package com.example.skica

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.skica.databinding.KontaktBinding
import kotlinx.android.synthetic.main.kontakt.*
import kotlin.system.exitProcess

class KontaktFragment : Fragment(R.layout.kontakt) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<KontaktBinding>(inflater, R.layout.kontakt, container, false)

        binding.idiNaPocetnu.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_kontaktFragment_to_pocetnaFragment)
        }

        binding.dugmeIzlaz.setOnClickListener{ view: View ->
            exitProcess(0)
        }


        binding.podijeliDugme.setOnClickListener(){
            val str = "I just got my vaccination appointment via Prijava za Vakcinaciju - KS"
            val intent_podijeli = Intent()

            intent_podijeli.action = Intent.ACTION_SEND
            intent_podijeli.type = "text/plain"

            intent_podijeli.putExtra(Intent.EXTRA_TEXT, str)
            //intent_podijeli.putExtra(Intent.EXTRA_SUBJECT, "nesto")
            startActivity(Intent.createChooser(intent_podijeli, "Podijeli poruku preko"))
        }



        return binding.root
    }
}
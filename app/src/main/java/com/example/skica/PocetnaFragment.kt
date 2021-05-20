package com.example.skica

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.skica.databinding.PocetnaBinding

class PocetnaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<PocetnaBinding>(inflater, R.layout.pocetna, container, false)

        binding.pocetnaDugme.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_pocetnaFragment_to_provjeraPreprekeFragment)
        }

        binding.pocetnaDugmeBa.setOnClickListener{ view: View ->
            binding.pocetnaNaslov.setText("Dobro došli \nZapočnite sa prijavom")
        }

        binding.pocetnaDugmeUs.setOnClickListener{ view: View ->
            binding.pocetnaNaslov.setText("Welcome \nStart your registration")
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}
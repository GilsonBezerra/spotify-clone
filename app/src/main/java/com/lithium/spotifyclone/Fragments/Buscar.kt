package com.lithium.spotifyclone.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lithium.spotifyclone.R

class Buscar : Fragment() {


    companion object {

        fun newInstance(): Buscar{
            // Criar fragment Buscar
            val fragmentBuscar = Buscar()
            val argumentos = Bundle()

            fragmentBuscar.arguments = argumentos

            return fragmentBuscar
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buscar, container, false)
    }

}
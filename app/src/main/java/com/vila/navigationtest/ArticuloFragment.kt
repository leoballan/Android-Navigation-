package com.vila.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.vila.navigationtest.databinding.FragmentArticuloBinding


class ArticuloFragment : Fragment(R.layout.fragment_articulo) {

    private  var _binding : FragmentArticuloBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticuloBinding.bind(view)
        init()
    }

    private fun init(){
        binding.btPlusArticulo.setOnClickListener {
            val arg = Articulo(7,"coca cola",0, precioSalon = 150.0)
            val action = ArticuloFragmentDirections
                .actionArticuloFragmentToArticuloDetalleFragment()
            findNavController().navigate(action)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
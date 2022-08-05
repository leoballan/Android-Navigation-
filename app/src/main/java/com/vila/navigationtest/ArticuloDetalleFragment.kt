package com.vila.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.vila.navigationtest.databinding.FragmentArticuloDetalleBinding



class ArticuloDetalleFragment : Fragment(R.layout.fragment_articulo_detalle) {

    private var _binding :FragmentArticuloDetalleBinding? = null
    private val binding get() = _binding!!
    val arg: ArticuloDetalleFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentArticuloDetalleBinding.bind(view)
        init()
    }

    private fun init() {
        binding.texto.setText(arg.articulo.toString())
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ArticuloDetalleFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
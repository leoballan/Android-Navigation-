package com.vila.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vila.navigationtest.databinding.FragmentRubroBinding


class RubroFragment : Fragment(R.layout.fragment_rubro) {

    private var _binding : FragmentRubroBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRubroBinding.bind(view)
        init()

    }

    private fun init(){
        binding.btPlusRubro.setOnClickListener {

            val action = RubroFragmentDirections.actionRubroFragmentToRubroDetalleFragment()
            findNavController().navigate(action)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RubroFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}
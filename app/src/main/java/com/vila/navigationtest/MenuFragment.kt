package com.vila.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.vila.navigationtest.databinding.ActivityMainBinding
import com.vila.navigationtest.databinding.FragmentMenuBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MenuFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private var _binding :FragmentMenuBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMenuBinding.inflate(
            layoutInflater,container,false)
        return binding.root
    }



    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

    }

    private fun init(){
        initListeners()
    }

    private fun initListeners(){

        binding.btArticulos.setOnClickListener {

            val action = MenuFragmentDirections.actionMenuFragmentToArticuloFragment()
            findNavController().navigate(action)

        }

        binding.btRubros.setOnClickListener {

            val action = MenuFragmentDirections.actionMenuFragmentToRubroFragment()
            findNavController().navigate(action)
        }

        binding.btClientes.setOnClickListener {

            val action = MenuFragmentDirections.actionMenuFragmentToClienteFragment()
            findNavController().navigate(action)
        }

        binding.btVentas.setOnClickListener {

            val action = MenuFragmentDirections.actionMenuFragmentToVentaFragment()
            findNavController().navigate(action)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
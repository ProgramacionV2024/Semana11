package com.jalfaro.semana11.view

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.jalfaro.semana11.databinding.ShowDialogFragmentBinding
import com.jalfaro.semana11.showCustomDialog
import com.jalfaro.semana11.showDialog


class FragmentShowDialog: Fragment() {
    lateinit var binding: ShowDialogFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ShowDialogFragmentBinding.inflate(inflater, container, false)
        binding.btnAbrirDialog.setOnClickListener {
            context?.let {showDialog(
                it,
                { hilera ->
                    binding.txtAccionEjecutada.text = "Se ecogio que ${hilera}"
                })
            }
        }
        binding.btnAbrirCustomDialog.setOnClickListener {
            context?.let {showCustomDialog(
                it,
                { nombre, apellido ->
                    binding.txtNombre.text = "${nombre} ${apellido}"
                })
            }
        }
        return binding.root
    }


}
package com.jalfaro.semana11

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import com.jalfaro.semana11.databinding.CustomDialogLayoutBinding
import java.util.zip.Inflater

fun showCustomDialog(context: Context, positiveAction: (String,String) -> Unit) {
    val dialog = AlertDialog.Builder(context)
    val binding = CustomDialogLayoutBinding.inflate(LayoutInflater.from(context))
    dialog.setTitle("Ingrese su Nombre")
    dialog.setView(binding.root)
    dialog.setPositiveButton("Grabar") { d, _ ->
        positiveAction(binding.txtNombre.text.toString(), binding.txtApellido.text.toString())
    }
    dialog.setNegativeButton("Cancelar") { d, _ ->
    }
    dialog.setCancelable(false)
    dialog.create().show()
}

fun showDialog(context: Context, action: (String) -> Unit) {
    val dialog = AlertDialog.Builder(context)
    dialog.setTitle("Informacion")
    dialog.setMessage("Desea continuar?")

    dialog.setPositiveButton("Si") { d, _ ->
        action("Si")
    }

    dialog.setNegativeButton("No") { d, _ ->
        action("No")
    }
    dialog.setNeutralButton("Talvez") {d, _ ->
        action("talvez")
    }
    dialog.setCancelable(false)
    dialog.create().show()
}
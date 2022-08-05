package com.vila.navigationtest

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Articulo(
    var id:Int
    , var name: String? = ""
    , var idRubro:Int
    , var eliminado:Boolean = false
    , var costo:Double = 0.0
    , var precioSalon: Double
    , var precioDelivery: Double = 0.0) :Parcelable
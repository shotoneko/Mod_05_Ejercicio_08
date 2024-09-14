package modulo_05.ejercicio_08.model

import androidx.annotation.DrawableRes

data class Book(
    var title: String,
    var author: String,
    var year: Int,
    @DrawableRes var imageRes: Int
)



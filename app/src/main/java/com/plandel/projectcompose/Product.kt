package com.plandel.projectcompose

import androidx.compose.ui.graphics.painter.Painter


data class Product(
    val name: String,
    val price: String,
    val image: Painter
)
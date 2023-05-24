package com.example.examplemotionlayout

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Title(
    modifier: Modifier = Modifier,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
    )
}

@Composable
fun Price(
    modifier: Modifier = Modifier,
    price: String,
) {
    Text(
        modifier = modifier,
        text = price,
        fontSize = 25.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Blue,
    )
}

package com.example.examplemotionlayout

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun ColorBackground(
    modifier: Modifier = Modifier,
) {
    val brush = listOf(
        Color.Blue.copy(alpha = 0.3f),
        Color.Blue,
    )
    Canvas(modifier = modifier, onDraw = {
        drawRect(
            brush = Brush.horizontalGradient(brush),
        )
    })
}

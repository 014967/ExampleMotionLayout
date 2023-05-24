package com.example.examplemotionlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource

@Composable
fun CircleImage(
    modifier: Modifier = Modifier,
) {
    Image(
        modifier = modifier.clip(CircleShape),
        painter = painterResource(R.drawable.image),
        contentDescription = null,
    )
}

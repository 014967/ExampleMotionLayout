package com.example.examplemotionlayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ExperimentalMotionApi
import androidx.constraintlayout.compose.MotionLayout
import androidx.constraintlayout.compose.MotionScene
import androidx.constraintlayout.compose.layoutId
import com.example.examplemotionlayout.ui.theme.ExampleMotionLayoutTheme

@OptIn(ExperimentalMotionApi::class)
@Composable
fun SnackDetail(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val motionScene = remember {
        context.resources.openRawResource(R.raw.snack)
            .readBytes()
            .decodeToString()
    }

    MotionLayout(
        modifier = modifier,
        motionScene = MotionScene(content = motionScene),
    ) {
        ColorBackground(modifier = Modifier.layoutId("colorBackground"))
        CircleImage(modifier = Modifier.layoutId("circleImage"))
        Box(modifier = Modifier.fillMaxSize().layoutId("background"))
        Title(modifier = Modifier.layoutId("title"), text = "Chips")
        Price(modifier = Modifier.layoutId("price"), price = "$12.55")
        SnackText(modifier = Modifier.layoutId("text"))
    }
}

@Preview
@Composable
fun PreviewSnackDetail() {
    ExampleMotionLayoutTheme {
        SnackDetail(
            modifier = Modifier.fillMaxSize(),
        )
    }
}

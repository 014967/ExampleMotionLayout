package com.example.examplemotionlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.examplemotionlayout.ui.theme.ExampleMotionLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleMotionLayoutTheme {
                // A surface container using the 'background' color from the theme
                SnackDetail(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

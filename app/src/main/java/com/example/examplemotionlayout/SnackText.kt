package com.example.examplemotionlayout

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun SnackText(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        userScrollEnabled = false,
    ) {
        item {
            Text(
                text = text,
                fontSize = 20.sp,
            )
        }
    }
}

val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis blandit ut. Etiam sed ipsum sed lacus eleifend hendrerit eu quis quam. Etiam ligula eros, finibus vestibulum tortor ac, ultrices accumsan dolor."
/*

 */

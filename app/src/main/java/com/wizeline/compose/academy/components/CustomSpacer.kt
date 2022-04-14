package com.wizeline.compose.academy.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomHeightSpacer(
    spacerHeight: SpacerWidthNHeight = SpacerWidthNHeight.MEDIUM
){
    val height = when(spacerHeight){
        SpacerWidthNHeight.EXTRA_SMALL -> 5.dp
        SpacerWidthNHeight.SMALL -> 10.dp
        SpacerWidthNHeight.MEDIUM -> 15.dp
        SpacerWidthNHeight.LARGE -> 20.dp
        SpacerWidthNHeight.EXTRA_LARGE -> 25.dp
        else -> 10.dp
    }

    Spacer(modifier = Modifier.height(height))
}

@Composable
fun CustomWidthSpacer(
    spacerWidth: SpacerWidthNHeight = SpacerWidthNHeight.MEDIUM
){
    val width = when(spacerWidth){
        SpacerWidthNHeight.EXTRA_SMALL -> 5.dp
        SpacerWidthNHeight.SMALL -> 10.dp
        SpacerWidthNHeight.MEDIUM -> 15.dp
        SpacerWidthNHeight.LARGE -> 20.dp
        SpacerWidthNHeight.EXTRA_LARGE -> 25.dp
        else -> 10.dp
    }

    Spacer(modifier = Modifier.width(width))
}

enum class SpacerWidthNHeight{
    EXTRA_SMALL,
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE
}


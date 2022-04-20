package com.wizeline.compose.academy.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wizeline.compose.academy.ui.theme.*

@Composable
fun CustomHeightSpacer(
    spacerHeight: SpacerWidthNHeight = SpacerWidthNHeight.MEDIUM
){
    val height = when(spacerHeight){
        SpacerWidthNHeight.EXTRA_SMALL -> dimen_5dp
        SpacerWidthNHeight.SMALL -> dimen_10dp
        SpacerWidthNHeight.MEDIUM -> dimen_15dp
        SpacerWidthNHeight.LARGE -> dimen_20dp
        SpacerWidthNHeight.EXTRA_LARGE -> dimen_25dp
        else -> dimen_10dp
    }

    Spacer(modifier = Modifier.height(height))
}

@Composable
fun CustomWidthSpacer(
    spacerWidth: SpacerWidthNHeight = SpacerWidthNHeight.MEDIUM
){
    val width = when(spacerWidth){
        SpacerWidthNHeight.EXTRA_SMALL -> dimen_5dp
        SpacerWidthNHeight.SMALL -> dimen_10dp
        SpacerWidthNHeight.MEDIUM -> dimen_15dp
        SpacerWidthNHeight.LARGE -> dimen_20dp
        SpacerWidthNHeight.EXTRA_LARGE -> dimen_25dp
        else -> dimen_10dp
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


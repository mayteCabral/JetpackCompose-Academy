package com.wizeline.compose.academy.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomSpacer(
    spacerHeight: SpacerHeight = SpacerHeight.MEDIUM
){
    val height = when(spacerHeight){
        SpacerHeight.EXTRASMALL -> 5.dp
        SpacerHeight.SMALL -> 10.dp
        SpacerHeight.MEDIUM -> 15.dp
        SpacerHeight.LARGE -> 20.dp
        else -> 10.dp
    }
    Spacer(modifier = Modifier.height(height))
}

enum class SpacerHeight{
    EXTRASMALL,
    SMALL,
    MEDIUM,
    LARGE
}
package com.wizeline.compose.academy.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.ui.theme.dimen_10dp
import com.wizeline.compose.academy.ui.theme.dimen_5dp

@Composable
fun CircleIconButton(
    icon: ImageVector
){
    Box(
        modifier = Modifier.padding(dimen_10dp)
    ) {
        Box(
            modifier = Modifier.padding(dimen_5dp)
                .background(
                    color = Color.White,
                    shape = CircleShape
                )
        ){
            Icon(
                icon,
                contentDescription = "icon",
                modifier = Modifier.padding(dimen_5dp)
            )
        }
    }

}
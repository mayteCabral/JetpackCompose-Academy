package com.wizeline.compose.academy.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {
    Card(elevation = 15.dp,
        shape = MaterialTheme.shapes.medium) {
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Search") },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "search")
            },
            shape = MaterialTheme.shapes.medium,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                errorBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                backgroundColor = Color.White
            ),
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )
    }

}
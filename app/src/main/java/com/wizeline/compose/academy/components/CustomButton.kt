package com.wizeline.compose.academy.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.ui.theme.dimen_5dp

@Composable
fun CustomButton(text: String, modifier: Modifier = Modifier, onActionClick: () -> Unit){
    Button(onClick = { onActionClick.invoke() },
    shape = MaterialTheme.shapes.medium,
    modifier = modifier) {
        Text(text = text,
        modifier = Modifier.padding(dimen_5dp),
        fontWeight = FontWeight.Bold)
    }
}
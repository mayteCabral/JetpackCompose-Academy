package com.wizeline.compose.academy.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R

@Composable
fun CustomButton(text:String, modifier: Modifier = Modifier){
    Button(onClick = { /*TODO*/ },
    shape = RoundedCornerShape(20.dp)) {
        Text(text = stringResource(id = R.string.label_sign_in))
    }
}
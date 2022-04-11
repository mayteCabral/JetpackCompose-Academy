package com.wizeline.compose.academy.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.components.CustomSpacer
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme

@Composable
fun LandingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.landing),
            contentDescription = "landing",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(text = stringResource(id = R.string.label_explore_places),
            style = MaterialTheme.typography.h4.copy(
                fontWeight = FontWeight.Bold,
                color = Color.White
            ))

            Text(text = stringResource(id = R.string.label_explore_places_description),
                style = MaterialTheme.typography.body1.copy(
                    color = Color.White
                ))

            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.label_sign_in))
            }

            CustomSpacer()


            CustomSpacer()

            Text(text = stringResource(id = R.string.label_create_account),
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                modifier = Modifier.fillMaxWidth())

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAcademyTheme {
        Surface() {
            LandingScreen()
        }
    }
}
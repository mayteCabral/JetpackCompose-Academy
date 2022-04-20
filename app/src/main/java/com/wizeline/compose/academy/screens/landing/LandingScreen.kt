package com.wizeline.compose.academy.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.components.CustomButton
import com.wizeline.compose.academy.components.CustomHeightSpacer
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.dimen_20dp
import com.wizeline.compose.academy.utils.defaultScreen

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
            modifier = Modifier.defaultScreen(),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(text = stringResource(id = R.string.label_explore_places),
            style = MaterialTheme.typography.h4.copy(
                fontWeight = FontWeight.Bold,
                color = Color.White
            ))

            CustomHeightSpacer()

            Text(text = stringResource(id = R.string.label_explore_places_description),
                style = MaterialTheme.typography.body1.copy(
                    color = Color.White
                ))



            CustomHeightSpacer()

            CustomButton(text = stringResource(id = R.string.label_sign_in), modifier = Modifier.fillMaxWidth()) {
            }

            CustomHeightSpacer()

            Text(text = stringResource(id = R.string.label_create_account),
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                textAlign= TextAlign.Center,
                modifier = Modifier.fillMaxWidth())

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPreview() {
    ComposeAcademyTheme {
        Surface() {
            LandingScreen()
        }
    }
}
package com.wizeline.compose.academy.screens

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.components.CustomWidthSpacer
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.dimen_100dp
import com.wizeline.compose.academy.ui.theme.dimen_10dp
import com.wizeline.compose.academy.ui.theme.dimen_5dp

@Composable
fun ImageGalleryScreen(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ){
        Image(
            painter = painterResource(id = R.drawable.hotel_gallery),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        
        Box(modifier = Modifier.padding(dimen_10dp)) {
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White
                    )
                    .padding(dimen_5dp)
            ) {
                ImageGalleryItem()

                CustomWidthSpacer()

                ImageGalleryItem(painterResource(id = R.drawable.hotel_gallery_3))

                CustomWidthSpacer()

                ImageGalleryItem(painterResource(id = R.drawable.hotel_gallery))

                CustomWidthSpacer()

            }
        }
    }
}

@Composable
private fun ImageGalleryItem(
    image:Painter = painterResource(id = R.drawable.hotel_gallery_2)
) {
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(dimen_100dp)

    )
}

@Preview
@Composable
fun PreviewImageGalleryScreen(){
    ComposeAcademyTheme() {
        Surface() {
            ImageGalleryScreen()
        }
    }
}
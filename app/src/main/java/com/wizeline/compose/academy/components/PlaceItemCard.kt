package com.wizeline.compose.academy.components

import android.service.notification.NotificationListenerService
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.PrimaryGravyVariant

@Composable
fun PlaceItemCard(){
    Card(modifier = Modifier.padding(20.dp),
    shape = RoundedCornerShape(20.dp)) {
        Column {
            Box(contentAlignment = Alignment.TopEnd) {
                Image(painter = painterResource(id = R.drawable.hotel_image_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .width(200.dp)
                    .height(150.dp))

                CircleIconButton()
            }


            Column(modifier = Modifier.padding(horizontal = 15.dp, vertical= 8.dp)) {
                Row() {
                    Ranking()
                    Text(text = "(370)")
                }

                Text(text = "Casa de las tortugas",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Bold
                    ))

                Row() {
                    Icon(Icons.Default.LocationOn, contentDescription = null)

                    Text(text = "Monterrey",
                        style = MaterialTheme.typography.h5.copy(
                            fontWeight = FontWeight.Bold
                        ))
                }


                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = MaterialTheme.colors.primary)
                    ){
                        append("$1,200")
                    }

                    withStyle(
                        style = SpanStyle(
                            color = PrimaryGravyVariant,
                            fontWeight = FontWeight.SemiBold)
                    ){
                        append("/")
                        append("/night")
                    }
                })
            }


        }

    }
}

@Composable
fun CircleIconButton(){
    Box(
        modifier = Modifier.padding(5.dp)
    ) {
        Box(){
            Icon(
                Icons.Default.FavoriteBorder,
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
        }
    }

}

@Composable
fun Ranking(){

    LazyRow(){
        items(5){
            Icon(Icons.Default.Star, contentDescription = null)
        }
    }

}

@Preview
@Composable
fun PreviePlaceItemCard(){
    ComposeAcademyTheme() {
        Surface {
            PlaceItemCard()
        }
    }
}
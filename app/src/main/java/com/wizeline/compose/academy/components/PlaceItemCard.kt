package com.wizeline.compose.academy.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.PrimaryGravyVariant
import com.wizeline.compose.academy.ui.theme.PrimaryOrange

@Composable
fun PlaceItemCard(){
    Card(modifier = Modifier.padding(5.dp),
    shape = MaterialTheme.shapes.medium,
    elevation = 5.dp) {
        Column {
            Box(contentAlignment = Alignment.TopEnd) {
                Image(painter = painterResource(id = R.drawable.hotel_image_1),
                    contentDescription = "place",
                    contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(250.dp)
                    .height(200.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(20.dp)))

                CircleIconButton(Icons.Default.FavoriteBorder)
            }


            Column(modifier = Modifier.padding(horizontal = 15.dp, vertical= 8.dp)) {

                CustomHeightSpacer(
                    spacerHeight = SpacerWidthNHeight.EXTRA_SMALL
                )

                Ranking()

                CustomHeightSpacer(
                    spacerHeight = SpacerWidthNHeight.EXTRA_SMALL
                )

                PlaceItemName("Casa Las tortugas")

                CustomHeightSpacer(
                    spacerHeight = SpacerWidthNHeight.EXTRA_SMALL
                )

                PlaceItemAddress("Monterrey")

                CustomHeightSpacer(
                    spacerHeight = SpacerWidthNHeight.EXTRA_SMALL
                )

                PlaceItemPrice()
            }


        }

    }
}

@Composable
fun PlaceItemName(
    name: String,
    textStyle: TextStyle = MaterialTheme.typography.h6
) {
    Text(
        text = name,
        style = textStyle.copy(
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun PlaceItemAddress(
    address: String,
    tintColor: Color = PrimaryGravyVariant
) {
    Row() {
        Icon(
            Icons.Default.LocationOn, contentDescription = "location_on",
            tint = tintColor
        )

        Text(
            text = address,
            style = MaterialTheme.typography.body1.copy(
                color = PrimaryGravyVariant
            )
        )
    }
}

@Composable
fun PlaceItemPrice() {
    Text(text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        ) {
            append("$1,200")
        }

        withStyle(
            style = SpanStyle(
                color = PrimaryGravyVariant,
                fontWeight = FontWeight.SemiBold
            )
        ) {
            append("/")
            append("night")
        }
    })
}



@Composable
fun Ranking(
    showLabel: Boolean = false
){
    Row() {
        for (i in 0 until 5) {
            Icon(
                Icons.Default.Star, contentDescription = "ranking",
                tint = PrimaryOrange
            )
        }

        Text(text = if (showLabel){"(370) reviews"}else{"(370)"}, style = MaterialTheme.typography.body2.copy(
            color = PrimaryGravyVariant
        ))
    }

}

@Preview
@Composable
fun PreviewPlaceItemCard(){
    ComposeAcademyTheme() {
        Surface {
            PlaceItemCard()
        }
    }
}
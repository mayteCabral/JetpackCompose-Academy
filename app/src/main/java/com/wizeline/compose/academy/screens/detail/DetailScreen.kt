package com.wizeline.compose.academy.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.components.*
import com.wizeline.compose.academy.ui.theme.*

@Composable
fun DetailScreen() {

    val size = LocalConfiguration.current
    val height = size.screenHeightDp * 0.3
    val contentHeight = size.screenHeightDp * 0.73

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(height = height.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hotel_image_1),
                    contentDescription = "hotel_image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    CircleIconButton(icon = Icons.Default.ArrowBack)

                    CircleIconButton(icon = Icons.Default.FavoriteBorder)
                }
            }
        }

        DetailCardContent(
            modifier = Modifier
                .fillMaxWidth()
                .height(contentHeight.dp)

        )
    }
}

@Composable
private fun DetailCardContent(modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(
            topEnd = dimen_30dp,
            topStart = dimen_30dp
        ),
        elevation = dimen_0dp,
        modifier = modifier
    ) {
        LazyColumn(
            modifier = Modifier.padding(dimen_10dp)
        ) {
            item {
                CustomHeightSpacer()

                PlaceItemName(
                    name = "Casa Las tortugas",
                    textStyle = MaterialTheme.typography.h5
                )

                CustomHeightSpacer()

                Ranking(
                    showLabel = true
                )

                CustomHeightSpacer()

                PlaceItemAddress(
                    address = "Monterrey"
                )

                CustomHeightSpacer()

                HorizontalTabList(list = listOf("Overview", "Details", "Costs"))

                CustomHeightSpacer()

                Text(
                    text = stringResource(id = R.string.label_place_description),
                    color = PrimaryGravyVariant
                )


                CustomHeightSpacer()

                Row {
                    Text(
                        text = "See more",
                        color = MaterialTheme.colors.primary
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "icon",
                        tint = MaterialTheme.colors.primary
                    )
                }

                CustomHeightSpacer()

                PlaceImageGalley()

                CustomHeightSpacer()

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    PlaceItemPrice()

                    CustomButton(
                        text = "Check availability"
                    ) {

                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewDetailScreen() {
    ComposeAcademyTheme() {
        Surface {
            DetailScreen()
        }

    }
}
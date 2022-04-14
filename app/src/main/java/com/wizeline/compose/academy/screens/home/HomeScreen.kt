package com.wizeline.compose.academy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.components.*
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.PrimaryGravyVariant
import com.wizeline.compose.academy.ui.theme.PrimaryGray


@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.label_explore),
            style= MaterialTheme.typography.h4.copy(
                color = PrimaryGray,
                fontWeight = FontWeight.Bold
            ))

            Icon(imageVector = Icons.Default.Notifications, contentDescription = null,
            tint = PrimaryGravyVariant)
        }

        Text(text = stringResource(id = R.string.label_explore_description),
            style= MaterialTheme.typography.body1.copy(
                color = PrimaryGray
            ))

        CustomHeightSpacer()

        SearchBar()

        CustomHeightSpacer()

        HorizontalTabList(list = listOf("Hotels", "Things to do", "Events"))

        CustomHeightSpacer()

        LazyRow(){
            items(3){
                PlaceItemCard()
            }
        }

        CustomHeightSpacer()

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){

            Text(text = "Categories",
                style = MaterialTheme.typography.h6.copy(
                    fontWeight = FontWeight.Bold
                ))

            Text(text = "See more",
                style = MaterialTheme.typography.body2.copy(
                    color = MaterialTheme.colors.primary
                ))
        }

        CustomHeightSpacer()

        LazyRow{
            items(4){
                CategoryItemCard()
            }
        }
    }
}



@Preview
@Composable
fun PreviewHomeScreen(){
    ComposeAcademyTheme() {
        Surface {
            HomeScreen()
        }
    }

}
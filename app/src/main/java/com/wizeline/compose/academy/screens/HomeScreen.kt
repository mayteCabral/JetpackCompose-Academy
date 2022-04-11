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
import com.wizeline.compose.academy.components.PlaceItemCard
import com.wizeline.compose.academy.ui.theme.ComposeAcademyTheme
import com.wizeline.compose.academy.ui.theme.PrimaryGravyVariant
import com.wizeline.compose.academy.ui.theme.PrimaryGray


@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.label_explore),
            style= MaterialTheme.typography.h4.copy(
                color = PrimaryGray
            ))

            Icon(imageVector = Icons.Default.Notifications, contentDescription = null,
            tint = PrimaryGravyVariant)
        }
        Text(text = stringResource(id = R.string.label_explore_description),
            style= MaterialTheme.typography.body1.copy(
                color = PrimaryGray
            ))

        SearchBar()

        HorizontalTabList()



        LazyRow(){
            items(5){
                PlaceItemCard()
            }
        }

    }
}

@Composable
private fun HorizontalTabList() {

    LazyRow(){
        items(5){
            HorizontalItemTab(position = it)
        }
    }



}

@Composable
private fun HorizontalItemTab(
    selectedIndex: Int = 0,
    position: Int = 0
) {
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "Hotels",
            style = MaterialTheme.typography.body2.copy(
                fontWeight = FontWeight.Bold,
                color = if(selectedIndex==position){
                    MaterialTheme.colors.primary
                }else{
                    PrimaryGravyVariant
                }
            )
        )

        if(selectedIndex==position){
            Box(
                modifier = Modifier
                    .size(5.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colors.primary)
            )
        }else{
            Box() {
                
            }
        }
        
    }
}

@Composable
private fun SearchBar() {
    TextField(
        value = "", onValueChange = {},
        placeholder = { Text(text = "Search") },
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "search")
        },
        shape = RoundedCornerShape(20.dp),
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

@Preview
@Composable
fun PreviewHomeScreen(){
    ComposeAcademyTheme() {
        Surface {
            HomeScreen()
        }
    }

}
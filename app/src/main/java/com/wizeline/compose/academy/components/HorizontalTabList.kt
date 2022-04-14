package com.wizeline.compose.academy.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.ui.theme.PrimaryGravyVariant

@Composable
fun HorizontalTabList(list: List<String>) {

    LazyRow(){
        itemsIndexed(list){index, item ->
            HorizontalItemTab(item, position = index)
        }
    }



}

@Composable
private fun HorizontalItemTab(
    item: String,
    selectedIndex: Int = 0,
    position: Int = 0
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            text = item,
            style = MaterialTheme.typography.body2.copy(
                fontWeight = FontWeight.Bold,
                color = if(selectedIndex==position){
                    MaterialTheme.colors.primary
                }else{
                    PrimaryGravyVariant
                }
            ),
            modifier = Modifier.padding(horizontal = 20.dp,
            vertical = 10.dp)
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
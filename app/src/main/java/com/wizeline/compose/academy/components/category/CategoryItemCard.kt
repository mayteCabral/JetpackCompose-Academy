package com.wizeline.compose.academy.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.R
import com.wizeline.compose.academy.ui.theme.dimen_0dp
import com.wizeline.compose.academy.ui.theme.dimen_10dp
import com.wizeline.compose.academy.ui.theme.dimen_50dp
import com.wizeline.compose.academy.ui.theme.dimen_5dp

@Composable
fun CategoryItemCard(){
    Card(shape = MaterialTheme.shapes.small,
    modifier = Modifier
        .background(color = Color.White)
        .padding(dimen_5dp),
    elevation = dimen_0dp) {

        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(dimen_10dp)) {
            Image(painter = painterResource(id = R.drawable.mountain), contentDescription = "place_image",
            modifier = Modifier
                .size(dimen_50dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop)
            CustomWidthSpacer(SpacerWidthNHeight.EXTRA_SMALL)
            Text(text = "Mountain")
        }
    }
}
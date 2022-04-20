package com.wizeline.compose.academy.utils

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wizeline.compose.academy.ui.theme.dimen_20dp

fun Modifier.defaultScreen() = this.fillMaxSize().padding(dimen_20dp)
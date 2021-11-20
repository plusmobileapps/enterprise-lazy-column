package com.plusmobileapps.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class HeaderItemData(val text: String) : EnterpriseLazyColumnItem

@Composable
fun HeaderItem(data: HeaderItemData) {
    Row(modifier = Modifier.height(60.dp).padding(8.dp)) {
        Text(text = data.text, fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
private fun HeaderItemPreview() {
    HeaderItem(data = HeaderItemData("Welcome"))
}
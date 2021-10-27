package com.plusmobileapps.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

data class HeaderItemData(val text: String) : EnterpriseLazyColumnItem

@Composable
fun HeaderItem(data: HeaderItemData) {
    Text(text = data.text)
}

@Preview
@Composable
private fun HeaderItemPreview() {
    HeaderItem(data = HeaderItemData("Welcome"))
}
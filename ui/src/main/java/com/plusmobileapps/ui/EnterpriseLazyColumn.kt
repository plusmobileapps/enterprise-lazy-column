package com.plusmobileapps.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.Flow

sealed interface EnterpriseLazyColumnItem

@Composable
fun EnterpriseLazyColumn(flow: Flow<List<EnterpriseLazyColumnItem>>) {
    val state = flow.collectAsState(initial = emptyList())
    LazyColumn {
        items(state.value.size) { index ->
            when (val item = state.value[index]) {
                is HeaderItemData -> HeaderItem(data = item)
                is ProfileBloc -> ProfileItem(item)
            }
        }
    }
}
package com.plusmobileapps.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow

interface ProfileBloc : EnterpriseLazyColumnItem {

    val state: Flow<State>

    data class State(val isLoading: Boolean = true, val name: String = "", val image: String = "")

    fun onChangeImageClicked()

}

@Composable
fun ProfileItem(bloc: ProfileBloc) {
    val state = bloc.state.collectAsState(ProfileBloc.State())

    Row(modifier = Modifier.fillMaxWidth().height(60.dp), horizontalArrangement = Arrangement.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            if (state.value.isLoading) {
                CircularProgressIndicator()
            } else {
                Column {
                    Text(text = state.value.name)
                }
            }
        }
    }

}

@Preview
@Composable
private fun ProfileItemPreview() {
    val bloc = object : ProfileBloc {
        override val state: Flow<ProfileBloc.State> = flow {
            emit(ProfileBloc.State(isLoading = true, name = "Andrew"))
            delay(2000L)
            emit(ProfileBloc.State(isLoading = false, name = "Andrew"))
        }

        override fun onChangeImageClicked() {
            TODO("Not yet implemented")
        }
    }
    ProfileItem(bloc = bloc)
}
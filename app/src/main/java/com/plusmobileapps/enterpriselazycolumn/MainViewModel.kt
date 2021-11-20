package com.plusmobileapps.enterpriselazycolumn

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plusmobileapps.ui.EnterpriseLazyColumnItem
import com.plusmobileapps.ui.HeaderItemData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _state: MutableStateFlow<List<EnterpriseLazyColumnItem>> = MutableStateFlow(listOf(
        HeaderItemData("Profile"),
        ProfileBlocImpl(viewModelScope),
        ProfileBlocImpl(viewModelScope),
        ProfileBlocImpl(viewModelScope),
        ProfileBlocImpl(viewModelScope),
        ProfileBlocImpl(viewModelScope),
        ProfileBlocImpl(viewModelScope),
    ))

    val state: StateFlow<List<EnterpriseLazyColumnItem>> get() = _state

}
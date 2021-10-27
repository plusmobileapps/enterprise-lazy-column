package com.plusmobileapps.enterpriselazycolumn

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plusmobileapps.ui.EnterpriseLazyColumnItem
import com.plusmobileapps.ui.HeaderItemData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel() : ViewModel() {

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
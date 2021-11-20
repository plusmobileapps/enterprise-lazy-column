package com.plusmobileapps.enterpriselazycolumn.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plusmobileapps.ui.EnterpriseLazyColumnItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val blocProvider: BlocProvider) : ViewModel() {

    private val _state: MutableStateFlow<List<EnterpriseLazyColumnItem>> = MutableStateFlow(listOf(
        blocProvider.createHeaderItem("Profile"),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),
        blocProvider.createProfileBloc(viewModelScope),

        blocProvider.createProfileBloc(viewModelScope),
    ))

    val state: StateFlow<List<EnterpriseLazyColumnItem>> get() = _state

}
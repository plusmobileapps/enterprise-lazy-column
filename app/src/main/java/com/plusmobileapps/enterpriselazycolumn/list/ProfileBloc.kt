package com.plusmobileapps.enterpriselazycolumn.list

import com.plusmobileapps.ui.ProfileBloc
import com.plusmobileapps.ui.ProfileBloc.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProfileBlocImpl(private val scope: CoroutineScope) : ProfileBloc {

    private val _state = MutableStateFlow(State())

    override val state: StateFlow<State>
        get() = _state

    init {
        scope.launch {
            delay((0..10_000L).random())
            _state.value = State(isLoading = false, "Andrew", image = "some-image-path")
        }
    }

    override fun onChangeImageClicked() {
        TODO("Not yet implemented")
    }

}
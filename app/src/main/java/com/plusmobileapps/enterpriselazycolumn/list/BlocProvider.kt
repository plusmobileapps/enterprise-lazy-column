package com.plusmobileapps.enterpriselazycolumn.list

import com.plusmobileapps.ui.HeaderItemData
import com.plusmobileapps.ui.ProfileBloc
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class BlocProvider @Inject constructor() {

    fun createHeaderItem(text: String): HeaderItemData {
        return HeaderItemData(text)
    }

    fun createProfileBloc(scope: CoroutineScope): ProfileBloc =
        ProfileBlocImpl(scope)

}

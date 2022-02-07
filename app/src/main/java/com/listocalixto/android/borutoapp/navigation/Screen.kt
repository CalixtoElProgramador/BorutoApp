package com.listocalixto.android.borutoapp.navigation

import com.listocalixto.android.borutoapp.app.Constants.ARG_KEY_DETAILS
import com.listocalixto.android.borutoapp.app.Constants.ROUTE_DETAIL_SCREEN
import com.listocalixto.android.borutoapp.app.Constants.ROUTE_HOME_SCREEN
import com.listocalixto.android.borutoapp.app.Constants.ROUTE_SEARCH_SCREEN
import com.listocalixto.android.borutoapp.app.Constants.ROUTE_SPLASH_SCREEN
import com.listocalixto.android.borutoapp.app.Constants.ROUTE_WELCOME_SCREEN

sealed class Screen(val route: String) {
    object Splash: Screen(ROUTE_SPLASH_SCREEN)
    object Welcome: Screen(ROUTE_WELCOME_SCREEN)
    object Home: Screen(ROUTE_HOME_SCREEN)
    object Detail: Screen("$ROUTE_DETAIL_SCREEN/{$ARG_KEY_DETAILS}") {
        fun passHeroId(heroId: Int): String {
            return "$ROUTE_DETAIL_SCREEN/$heroId"
        }
    }
    object Search: Screen(ROUTE_SEARCH_SCREEN)

}

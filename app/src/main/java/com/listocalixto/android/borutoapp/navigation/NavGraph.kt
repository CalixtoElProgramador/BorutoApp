package com.listocalixto.android.borutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.accompanist.pager.ExperimentalPagerApi
import com.listocalixto.android.borutoapp.app.Constants.ARG_KEY_DETAILS
import com.listocalixto.android.borutoapp.presentation.screens.home.HomeScreen
import com.listocalixto.android.borutoapp.presentation.screens.splash.SplashScreen
import com.listocalixto.android.borutoapp.presentation.screens.welcome.WelcomeScreen

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Detail.route, arguments = listOf(navArgument(ARG_KEY_DETAILS) {
            type = NavType.IntType
        })) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}
package com.ahmadsodik.movieshof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.ahmadsodik.movieshof.core.route.AppRoute
import com.ahmadsodik.movieshof.ui.theme.MovieShofTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /// from Accompanist, setting a status bar
            val systemUiController = rememberSystemUiController()
            systemUiController.setStatusBarColor(
                color = Color.Transparent,
                darkIcons = true,
            )
            systemUiController.setNavigationBarColor(
                color = Color.Transparent,
                darkIcons = true,
            )

            MovieShofTheme {
                /// main navigation
                val navController = rememberNavController()
                AppRoute.GenerateRoute(navController = navController)
            }
        }
    }
}
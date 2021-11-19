package com.example.jetpacktalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpacktalk.ui.theme.JetpackTalkTheme
import com.example.jetpacktalk.ui.view.ClickMe
import com.example.jetpacktalk.ui.view.LazyExample
import com.example.jetpacktalk.ui.view.Resources
import com.example.jetpacktalk.util.Screens

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Screens.HOME) {
                composable(Screens.HOME) { Home(navController = navController) }
                composable(Screens.STYLE_EXAMPLE) { Resources() }
                composable(Screens.CLICK_ME) { ClickMe() }
                composable(Screens.LAZY_EXAMPLE) { LazyExample() }
                composable(Screens.SCAFFOLD_EXAMPLE) { LazyExample() }
            }
        }
    }
}
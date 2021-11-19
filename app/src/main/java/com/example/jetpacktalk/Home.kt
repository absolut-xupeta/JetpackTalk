package com.example.jetpacktalk

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpacktalk.util.Screens

@Composable
fun Home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate(Screens.STYLE_EXAMPLE) }) {
            Text(text = Screens.STYLE_EXAMPLE)
        }

        Button(onClick = { navController.navigate(Screens.CLICK_ME) }) {
            Text(text = Screens.CLICK_ME)
        }

        Button(onClick = { navController.navigate(Screens.LAZY_EXAMPLE) }) {
            Text(text = Screens.LAZY_EXAMPLE)
        }

        Button(
            onClick = {
                navController.navigate(Screens.SCAFFOLD_EXAMPLE)
            }
        ) {
            Text(text = Screens.SCAFFOLD_EXAMPLE)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    //Home()
}
package com.example.jetpacktalk.ui.view

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacktalk.ui.theme.JetpackTalkTheme
import com.example.jetpacktalk.ui.theme.TopBarType

@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Top Bar", style = TopBarType) }
            )
        }
    ) {
        Text(text = "Dark mode")
    }
}

@Preview
@Composable
private fun ScaffoldExamplePreview() {
    JetpackTalkTheme(darkTheme = true) {
        ScaffoldExample()
    }
}
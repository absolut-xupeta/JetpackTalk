package com.example.jetpacktalk

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacktalk.ui.theme.*

@Composable
fun Resources() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Rows()
    }
}

@Composable
private fun Rows() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Purple700),
        horizontalArrangement = Arrangement.Start
    ) {
        Text(text = "Teste 1", style = Typography.h1, color = White)
    }

    Row(
        modifier = Modifier
            .background(Purple500)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Teste 2", style = Typography.h2)
    }

    Row(
        modifier = Modifier
            .background(Purple200)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Text(text = "Teste 3", style = Typography.h3, color = White)
    }
}

@Preview(showBackground = true)
@Composable
private fun ResourcesPreview() {
    Resources()
}
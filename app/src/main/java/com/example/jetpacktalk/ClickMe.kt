package com.example.jetpacktalk

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ClickMe() {
    var state by remember { mutableStateOf("") }

    var counter = 0

    state = when (counter) {
        0 -> stringResource(id = R.string.hello)
        1 -> stringResource(id = R.string.ouch)
        else -> stringResource(id = R.string.stop_touching_me)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = state)

            Spacer(modifier = Modifier.padding(end = 20.dp))

            Button(onClick = { counter += 1 }) {
                Text(text = "Button")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ClickMePreview() {
    ClickMe()
}

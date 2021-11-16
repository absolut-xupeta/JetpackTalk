package com.example.jetpacktalk

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktalk.ui.theme.Purple700
import com.example.jetpacktalk.ui.theme.Teal200
import com.example.jetpacktalk.ui.theme.Typography

@Composable
fun LazyExample() {
    val numberList by remember {
        mutableStateOf((1..10).toList())
    }

    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            Text(
                text = stringResource(id = R.string.im_static),
                style = Typography.h1,
                color = Purple700
            )
        }

        items(numberList) { number ->
            Spacer(modifier = Modifier.padding(top = 15.dp))

            Text(text = "$number", style = Typography.body1, color = Teal200)

            if (number == 10) {
                Text(text = "---------------", style = Typography.body1)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyExamplePreview() {
    LazyExample()
}
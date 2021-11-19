package com.example.jetpacktalk.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktalk.R
import com.example.jetpacktalk.ui.theme.*

@Composable
fun LazyExample() {
    val numberList by remember {
        mutableStateOf((1..20).toList())
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = stringResource(id = R.string.single_item),
                style = Typography.h1,
                color = Purple700
            )
        }

        items(numberList) { number ->
            Spacer(modifier = Modifier.padding(top = 15.dp))

            SimpleCard(number)
        }
    }
}

@Composable
private fun SimpleCard(number: Int) {
    val color = if (number % 2 == 0) {
        Purple500
    } else {
        Purple200
    }

    Row(modifier = Modifier
        .padding(horizontal = 10.dp)
        .fillMaxWidth()
        .clip(Shapes.large)
        .background(color = color),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "$number", style = Typography.body1, color = Color.Black)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyExamplePreview() {
    LazyExample()
}
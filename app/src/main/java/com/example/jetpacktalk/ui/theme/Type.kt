package com.example.jetpacktalk.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
        h1 = TextStyle(
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Normal,
                fontSize = 32.sp
        ),
        h2 = TextStyle(
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Normal,
                fontSize = 26.sp,
                color = White
        ),
        h3 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp
        ),
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 32.sp
        )
)

val TopBarType = TextStyle(fontSize = 25.sp)
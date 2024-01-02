package com.example.simpleKotlinProject.content

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.simpleKotlinProject.ui.theme.MyApplicationTheme

@Composable
fun Sum() {
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val numbers = arrayOf(1, 2, 3, 4, 5)
            var sum = 0
            var index = 0
            while (index <= 4) {
                sum += numbers[index]
                index++
            }

            Log.d("MainActivity", "sum = $sum")

            Text(
                text = "Sum = $sum",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun SumPreview() {
    Sum()
}

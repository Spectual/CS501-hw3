package com.example.splitscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.splitscreen.ui.theme.SplitScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitScreenTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeightSplitScreen()
                }
            }
        }
    }
}

@Composable
fun WeightSplitScreen() {
    Row(modifier = Modifier.fillMaxSize()) {
        // left 25%
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFF6C63FF)),
            contentAlignment = Alignment.Center
        ) { Text("25%", color = Color.White) }

        // right 75% Column 2:3:5
        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxHeight()
        ) {
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(Color(0xFFFF6B6B)),
                contentAlignment = Alignment.Center
            ) { Text("2", color = Color.White) }

            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxWidth()
                    .background(Color(0xFF20C997)),
                contentAlignment = Alignment.Center
            ) { Text("3", color = Color.White) }

            Box(
                modifier = Modifier
                    .weight(5f)
                    .fillMaxWidth()
                    .background(Color(0xFFFFC107)),
                contentAlignment = Alignment.Center
            ) { Text("5", color = Color.White) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeightSplitScreen() {
    SplitScreenTheme {
        WeightSplitScreen()
    }
}
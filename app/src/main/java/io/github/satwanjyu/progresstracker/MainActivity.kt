@file:OptIn(ExperimentalMaterial3Api::class)

package io.github.satwanjyu.progresstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.satwanjyu.progresstracker.ui.theme.ProgressTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    ProgressTrackerTheme {
        Scaffold(
            topBar = {
                LargeTopAppBar(
                    title = { Text(text = "Progress Tracker") },
                )
            }
        ) { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                Text(text = "Hello World")
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}
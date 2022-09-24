@file:OptIn(ExperimentalMaterial3Api::class)

package io.github.satwanjyu.progresstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow
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
                TrackersList(trackers = fakeTrackers)
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}

@Composable
fun TrackersList(trackers: List<Tracker>) {
    LazyColumn {
        items(trackers) { tracker ->
            TrackerItem(tracker)
        }
    }
}

@Composable
fun TrackerItem(tracker: Tracker) {
    ListItem(
        leadingContent = {
            // Circle indicating overall progress
        },
        headlineText = {
            Text(tracker.name)
        },
        supportingText = {
            FlowRow {
                tracker.steps.forEach { step ->
                    TrackerDot(completed = step.completed)
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TrackerItemPreview() {
    TrackerItem(fakeTrackers[0])
}

@Composable
fun TrackerDot(completed: Boolean) {
    // Draws a ring
    val ringColor = MaterialTheme.colorScheme.primary
    val centerColor = if (completed) {
        MaterialTheme.colorScheme.primaryContainer
    } else {
        MaterialTheme.colorScheme.surface
    }
    val strokeWidth = 4.dp
    Canvas(modifier = Modifier
        .size(24.dp)
        .padding(4.dp)) {
        val radius = size.minDimension / 2
        // Ring
        drawCircle(
            color = ringColor,
            radius = radius,
            style = Stroke(width = strokeWidth.toPx())
        )
        // Center
        drawCircle(
            color = centerColor,
            radius = radius - strokeWidth.toPx() / 2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TrackerDotPreview() {
    TrackerDot(true)
}
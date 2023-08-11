package com.gralliams.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gralliams.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.first_quadrant_title),
                body = stringResource(R.string.first_quadrant_body),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                title = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.quarant3_title),
                body = stringResource(R.string.quadrant3_body),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                title = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(
    title: String,
    body: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}

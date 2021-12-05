package linh.nv7.epoch.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import linh.nv7.epoch.ui.theme.whiteText

@Composable
fun TopBar() {
    Text(
        text = "Epoch",
        modifier = Modifier.padding(32.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h4,
        color = whiteText
    )
}

@Composable
fun Toolbar() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        TopBar()
    }
}

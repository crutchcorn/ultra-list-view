package dev.oceanbit.ultralistview

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun UltraItemsList() {
    val containerModifier = Modifier
        .background(Color.Red)
        .padding(16.dp);

    val textModifier = Modifier
        .background(Color.Green)
        .fillMaxWidth();

    LazyColumn(content = {
        items(ultraItemsList) {  ultraItem ->
            Box(
                containerModifier
            ) {
                Text(
                    text = ultraItem.name,
                    modifier = textModifier
                )
            }
        }
    })
}
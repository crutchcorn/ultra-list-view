package dev.oceanbit.ultralistview

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UltraItemsScreen() {
    val viewModel = viewModel<UltraItemsListViewModel>()
    val itemsList = viewModel.items.observeAsState(emptyList())
    val itemsValue = itemsList.value;

    Scaffold(content = {
        if (itemsValue.isNotEmpty()) {
            UltraItemsList(itemsValue)
        } else {
            NoUltraItems()
        }
    }, floatingActionButton = {
        FloatingActionButton(onClick = {
            viewModel.onAdd()
        }, shape = RoundedCornerShape(16.dp)) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = "Add item")
        }
    })
}

@Composable
fun UltraItemsList(itemsList: List<String>) {
    LazyColumn(content = {
        items(itemsList) { item ->
            Text(text = item, modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth())
        }
    })
}

@Composable
fun NoUltraItems() {
    Text(text = "There are no items yet")
}

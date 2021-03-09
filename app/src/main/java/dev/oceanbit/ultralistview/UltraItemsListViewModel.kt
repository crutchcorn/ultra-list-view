package dev.oceanbit.ultralistview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UltraItemsListViewModel: ViewModel() {
    private val _items = MutableLiveData(listOf<String>())
    val items: LiveData<List<String>> = _items

    fun onAdd() {
        val itemsList = mutableListOf<String>()
        itemsList.addAll(_items.value.orEmpty())
        val newNum = itemsList.size + 1;
        itemsList.add(newNum.toString());
        _items.value = itemsList;
    }
}
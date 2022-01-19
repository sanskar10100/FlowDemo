package dev.sanskar.flowdemo

import androidx.lifecycle.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

// VM
class MainViewModel : ViewModel() {
    val response = Repository
        .latestResponse
        .stateIn(viewModelScope, SharingStarted.Lazily, ApiResponse(""))
        .map {
            it.message
        }
}
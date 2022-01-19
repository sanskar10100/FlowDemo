package dev.sanskar.flowdemo

import androidx.lifecycle.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

// VM
class MainViewModel : ViewModel() {
    val response = Repository.latestResponse
}
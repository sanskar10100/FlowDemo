package dev.sanskar.flowdemo

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
private const val TAG = "Repository"

// Repository
object Repository {
    val latestResponse: Flow<ApiResponse> = flow {
        while(true) {
            try {
                val response = ApiService.retrofitService.getRecords()
                emit(response)
                delay(1000)
            } catch (e: Exception) {
                // TODO handle through UiState wrapper
                Log.d(TAG, "An exception occurred: ${e.message}")
            }
        }
    }
}
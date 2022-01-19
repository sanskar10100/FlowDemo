package dev.sanskar.flowdemo

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

// Repository
object Repository {
    val latestResponse: Flow<ApiResponse> = flow {
        while(true) {
            val response = ApiService.retrofitService.getRecords()
            emit(response)
            delay(1000)
        }
    }
}
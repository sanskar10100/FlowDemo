package dev.sanskar.flowdemo

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

// Repository
object Repository {
    val latestResponse: Flow<ApiResponse> = flow {
        for (i in 0..10) {
            emit(ApiResponse("Call Count: ${i + 1}"))
            delay(1000)
        }
    }
}
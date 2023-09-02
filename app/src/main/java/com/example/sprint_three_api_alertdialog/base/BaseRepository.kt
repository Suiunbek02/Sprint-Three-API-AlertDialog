package com.example.sprint_three_api_alertdialog.base


import com.example.sprint_three_api_alertdialog.common.Resource
import kotlinx.coroutines.flow.flow

abstract class BaseRepository {

    protected fun <T> doRequest(result:  suspend () -> T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(result()))
        } catch (exception: Exception) {
            emit(Resource.Error(message = exception.localizedMessage ?: "Error"))
        }
    }
}
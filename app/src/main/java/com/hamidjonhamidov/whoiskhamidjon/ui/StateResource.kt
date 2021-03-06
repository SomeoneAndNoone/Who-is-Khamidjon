package com.hamidjonhamidov.whoiskhamidjon.ui

data class Loading(val isLoading: Boolean)
data class Data<T>(val dataReceived: Event<T>?, val responseReceived: Event<MyResponse>?)
data class StateError(val myResponse: MyResponse)

data class MyResponse(var message: String?, val responseType: ResponseType)
sealed class ResponseType{

    class Snackbar: ResponseType()

    class Dialog: ResponseType()

    class None: ResponseType()
}

open class Event<out T>(private val content: T){

    var hasBeenHandled = false
        private set // allow external read only

    fun getContentIfNotHandled(): T?{

        return if(hasBeenHandled) null else {
            // it is the way around
//            if(content is MyResponse){
//                content.message = null
//            }

            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content

    companion object{
        // we don't want an event if the data is null

        fun <T> dataEvent(data: T?)
                = if(data==null) null else Event(data)


        // we don't want an event if the response is null

        fun responseEvent(response: MyResponse?)
                = if(response==null) null else Event(response)

    }
}





















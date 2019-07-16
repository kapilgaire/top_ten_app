package com.example.myapplication.utils.commons

data class Resources<out T> private constructor(val status: Status, val data: T?) {

    companion object {

        fun <T> error(data: T? = null): Resources<T> = Resources(Status.ERROR, data)

        fun <T> loading(data: T? = null): Resources<T> = Resources(Status.LOADING, data)


        fun <T> success(data: T? = null): Resources<T> = Resources(Status.SUCCESS, data)


        fun <T> unknown(data: T? = null): Resources<T> = Resources(Status.UNKNOWN, data)

    }
}
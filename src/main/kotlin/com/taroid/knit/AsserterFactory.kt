package com.taroid.knit

object AsserterFactory {

    fun <T> newInstance(target: T): Asserter<T> = AsserterImpl(target)
}
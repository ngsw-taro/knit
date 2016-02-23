package com.taroid.knit

import org.hamcrest.Matcher

interface Asserter<T> {

    val target: T

    operator fun invoke(matcher: Matcher<T>)

    infix fun not(matcher: Matcher<T>)

    infix fun be(expected: T)

    infix fun be(matcher: Matcher<T>)

    infix fun be(block: () -> T)

    infix fun notBe(unexpected: T)

    infix fun notBe(matcher: Matcher<T>)

    infix fun notBe(block: () -> T)
}
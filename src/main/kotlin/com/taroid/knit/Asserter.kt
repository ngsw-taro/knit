package com.taroid.knit

import org.hamcrest.Matcher

interface Asserter<T> {

    val target: T

    infix fun not(matcher: Matcher<in T>)

    infix fun be(expected: T)

    infix fun be(matcher: Matcher<in T>)

    infix fun be(block: () -> T)

    infix fun notBe(unexpected: T)

    infix fun notBe(matcher: Matcher<in T>)

    infix fun notBe(block: () -> T)
}
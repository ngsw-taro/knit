package com.taroid.knit

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.Matcher
import org.junit.Assert.assertThat

internal class AsserterImpl<T>(override val target: T): Asserter<T> {

    override fun invoke(matcher: Matcher<T>) {
        assertThat(target, matcher)
    }

    override fun not(matcher: Matcher<T>) {
        invoke(CoreMatchers.not(matcher))
    }

    override fun be(expected: T) {
        invoke(`is`(expected))
    }

    override fun be(matcher: Matcher<T>) {
        invoke(matcher)
    }

    override fun be(block: () -> T) {
        be(block())
    }

    override fun notBe(unexpected: T) {
        invoke(CoreMatchers.not(unexpected))
    }

    override fun notBe(matcher: Matcher<T>) {
        not(matcher)
    }

    override fun notBe(block: () -> T) {
        notBe(block())
    }
}
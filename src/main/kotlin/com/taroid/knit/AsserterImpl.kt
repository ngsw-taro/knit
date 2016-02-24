package com.taroid.knit

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.Matcher
import org.junit.Assert.assertThat

internal class AsserterImpl<T>(override val target: T): Asserter<T> {

    override fun not(matcher: Matcher<in T>) {
        target.should(CoreMatchers.not(matcher))
    }

    override fun be(expected: T) {
        target.should(`is`(expected))
    }

    override fun be(matcher: Matcher<in T>) {
        target.should(matcher)
    }

    override fun be(block: () -> T) {
        be(block())
    }

    override fun notBe(unexpected: T) {
        target.should(CoreMatchers.not(unexpected))
    }

    override fun notBe(matcher: Matcher<in T>) {
        not(matcher)
    }

    override fun notBe(block: () -> T) {
        notBe(block())
    }
}
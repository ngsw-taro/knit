package com.taroid.knit

import org.hamcrest.Matcher
import org.junit.Assert

val <T> T.should: Asserter<T>
    get() = AsserterFactory.newInstance(this)

val <T> (() -> T).should: Asserter<T>
    get() = this().should

fun <T> T.should(matcher: Matcher<in T>) {
    Assert.assertThat(this, matcher)
}
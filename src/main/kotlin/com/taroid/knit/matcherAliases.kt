package com.taroid.knit

import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher

inline fun <reified T: Any> a(): Matcher<T> = CoreMatchers.isA(T::class.java)

inline fun <reified T: Any> any(): Matcher<T> = CoreMatchers.any(T::class.java)

fun containString(substring: String): Matcher<String> = CoreMatchers.containsString(substring)

fun startWith(prefix: String): Matcher<String> = CoreMatchers.startsWith(prefix)

fun endWith(suffix: String): Matcher<String> = CoreMatchers.endsWith(suffix)

fun <T> haveItem(item: T): Matcher<in Iterable<T>> = CoreMatchers.hasItem(item)

fun <T> haveItem(itemMatcher: Matcher<in T>): Matcher<in Iterable<T>> = CoreMatchers.hasItem(itemMatcher)

fun <T> haveItems(vararg item: T): Matcher<in Iterable<T>> = CoreMatchers.hasItems(*item)

fun <T> haveItems(vararg itemMatcher: Matcher<in T>): Matcher<in Iterable<T>> = CoreMatchers.hasItems(*itemMatcher)
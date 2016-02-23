package com.taroid.knit

val <T> T.should: Asserter<T>
    get() = AsserterFactory.newInstance(this)

val <T> (() -> T).should: Asserter<T>
    get() = this().should
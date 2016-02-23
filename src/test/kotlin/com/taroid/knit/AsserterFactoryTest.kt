package com.taroid.knit

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.sameInstance
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class AsserterFactoryTest {

    class newInstance {

        @Test
        fun `should return Asserter with specified target`() {
            val expected = Any()
            val got = AsserterFactory.newInstance(expected)
            assertThat(got.target, `is`(sameInstance(expected)))
        }
    }
}
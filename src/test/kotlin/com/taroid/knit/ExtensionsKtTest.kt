package com.taroid.knit

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.sameInstance
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class ExtensionsKtTest {

    class `should for T` {

        @Test
        fun `should be alias for AssertFactory#newInstance`() {
            val target = Any()
            val origin = AsserterFactory.newInstance(target)
            val alias = target.should

            assertThat(alias.javaClass, `is`(sameInstance(origin.javaClass)))
            assertThat(alias.target, `is`(sameInstance(origin.target)))
        }
    }

    class `should for lazy T` {

        @Test
        fun `should return Asserter which equals what T#should returns`() {
            val target = Any()
            val expected = target.should
            val got = { target }.should

            assertThat(got.javaClass, `is`(sameInstance(expected.javaClass)))
            assertThat(got.target, `is`(sameInstance(expected.target)))
        }
    }
}
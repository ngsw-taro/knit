package com.taroid.knit

import org.hamcrest.CoreMatchers.sameInstance
import org.hamcrest.CoreMatchers.startsWith
import org.junit.Ignore
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class AsserterImplTest {

    @Ignore
    companion object {
        private val sut: AsserterImpl<String> = AsserterImpl("Kotlin")
    }

    class `be - expected` {

        @Test
        fun `dose nothing when target equals expected`() {
            sut be java.lang.String("Kotlin").toString()
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target dose not equal expected`() {
            sut be "kotlin"
        }
    }

    class `be - matcher` {

        @Test
        fun `dose nothing when target matches specified matcher`() {
            sut be sameInstance("Kotlin")
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target dose not match specified matcher`() {
            sut be sameInstance(java.lang.String("Kotlin").toString())
        }
    }

    class `be - block` {

        @Test
        fun `dose nothing when target equals what block returns`() {
            sut be { java.lang.String("Kotlin").toString() }
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target dose not equal what block returns`() {
            sut be { "kotlin" }
        }
    }

    class `notBe - unexpected` {

        @Test
        fun `dose nothing when target dose not equal unexpected`() {
            sut notBe "kotlin"
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target equals expected`() {
            sut notBe "Kotlin"
        }
    }

    class `notBe - matcher` {

        @Test
        fun `dose nothing when target dose not match specified matcher`() {
            sut notBe sameInstance(java.lang.String("Kotlin").toString())
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target matches specified matcher`() {
            sut notBe sameInstance("Kotlin")
        }
    }

    class `notBe - block` {

        @Test
        fun `dose nothing when target dose not equal what block returns`() {
            sut notBe { "kotlin" }
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target equals what block returns`() {
            sut notBe { java.lang.String("Kotlin").toString() }
        }
    }

    class `invoke` {

        @Test
        fun `dose nothing when target matches specified matcher`() {
            sut(startsWith("Ko"))
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target dose not match specified matcher`() {
            sut(startsWith("ko"))
        }
    }

    class `not` {

        @Test
        fun `dose nothing when target dose not match specified matcher`() {
            sut not startsWith("ko")
        }

        @Test(expected = AssertionError::class)
        fun `throws error when target matches specified matcher`() {
            sut not startsWith("Ko")
        }
    }
}
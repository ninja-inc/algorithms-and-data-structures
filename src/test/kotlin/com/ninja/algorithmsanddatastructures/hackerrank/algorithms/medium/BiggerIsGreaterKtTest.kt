package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BiggerIsGreaterKtTest {
    @Test
    fun test01() {
        assertThat(biggerIsGreater("123"))
            .isEqualTo("132")
    }

    @Test
    fun test11() {
        assertThat('a' < 'b').isTrue()
        assertThat('a' == 'a').isTrue()
        assertThat('a' > 'b').isFalse()
    }

    @Test
    fun test12() {
        val a = listOf('1', '2', '3')
        val b = "123".toCharArray().toList()

        assertThat(a == b).isTrue()
    }
}
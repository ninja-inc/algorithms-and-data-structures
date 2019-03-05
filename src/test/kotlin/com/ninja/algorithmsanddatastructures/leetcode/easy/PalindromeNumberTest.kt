package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PalindromeNumberTest {
    private val logic = PalindromeNumber()

    @Test
    fun test01() {
        assertThat(logic.run(121)).isTrue()
    }

    @Test
    fun test02() {
        assertThat(logic.run(123454321)).isTrue()
    }

    @Test
    fun test03() {
        assertThat(logic.run(-121)).isFalse()
    }

    @Test
    fun test04() {
        assertThat(logic.run(10)).isFalse()
    }
}
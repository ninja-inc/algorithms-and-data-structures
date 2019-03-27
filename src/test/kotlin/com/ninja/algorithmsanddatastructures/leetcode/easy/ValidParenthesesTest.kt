package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidParenthesesTest {
    val logic = ValidParentheses()

    @Test
    fun test01() {
        assertThat(logic.run("()")).isTrue()
    }

    @Test
    fun test02() {
        assertThat(logic.run("[()]{}")).isTrue()
    }

    @Test
    fun test03() {
        assertThat(logic.run("({)}")).isFalse()
    }
}
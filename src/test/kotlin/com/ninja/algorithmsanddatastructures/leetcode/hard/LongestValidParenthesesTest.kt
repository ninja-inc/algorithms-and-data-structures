package com.ninja.algorithmsanddatastructures.leetcode.hard

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongestValidParenthesesTest {
    val logic = LongestValidParentheses()

    @Test
    fun test01() {
        assertThat(logic.longestValidParentheses("(()"))
            .isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(logic.longestValidParentheses(")()())"))
            .isEqualTo(4)
    }
}
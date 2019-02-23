package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongestPalindromicSubstringTest {
    val logic = LongestPalindromicSubstring()

    @Test
    fun test1() {
        assertThat(logic.run("babad"))
                .isEqualTo("bab")
    }

    @Test
    fun test2() {
        assertThat(logic.run("cbbd"))
                .isEqualTo("bb")
    }

    @Test
    fun test3() {
        assertThat(logic.run("forgeeksskeegfor"))
                .isEqualTo("geeksskeeg")
    }

    @Test
    fun test11() {
        assertThat(logic.palindromic("bab")).isTrue()
    }
}

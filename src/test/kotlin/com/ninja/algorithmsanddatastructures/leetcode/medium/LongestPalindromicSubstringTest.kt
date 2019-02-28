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
    fun test21() {
        assertThat(logic.run2("babad"))
                .isEqualTo("bab")
    }

    @Test
    fun test22() {
        assertThat(logic.run2("cbbd"))
                .isEqualTo("bb")
    }

    @Test
    fun test23() {
        assertThat(logic.run2("forgeeksskeegfor"))
                .isEqualTo("geeksskeeg")
    }


    @Test
    fun test11() {
        assertThat(logic.palindromic("bab")).isTrue()
    }

    @Test
    fun test111() {
        assertThat(logic.palindromic("a")).isTrue()
    }

    @Test
    fun test1111() {
        assertThat("babad"[0] == "babad"[2]).isTrue()
    }
}

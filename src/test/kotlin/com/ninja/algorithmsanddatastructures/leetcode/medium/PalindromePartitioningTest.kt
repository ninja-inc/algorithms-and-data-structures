package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PalindromePartitioningTest {
    val logic = PalindromePartitioning()

    @Test
    fun test00() {
        println(logic.partition("aab"))
    }

    @Test
    fun test01() {
        assertThat(logic.isPalindrome("abccba")).isTrue()
    }

    @Test
    fun test02() {
        assertThat(logic.isPalindrome("abccbb")).isFalse()
    }

    @Test
    fun test03() {
        assertThat(logic.isPalindrome("abcba")).isTrue()
    }

    @Test
    fun test04() {
        assertThat(logic.isPalindrome("abcbb")).isFalse()
    }
}
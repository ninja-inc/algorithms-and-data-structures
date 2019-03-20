package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongestCommonPrefixTest {
    private val logic = LongestCommonPrefix()

    @Test
    fun test01() {
        assertThat(logic.run(listOf("flower","flow","flight"))).isEqualTo("fl")
    }

    @Test
    fun test02() {
        assertThat(logic.run(listOf("dog","racecar","car"))).isEqualTo("")
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.hard

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FirstMissingPositiveTest {
    val logic = FirstMissingPositive()

    @Test
    fun test01() {
        assertThat(logic.firstMissingPositive(intArrayOf(3,4,-1,1)))
            .isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(logic.firstMissingPositive(intArrayOf(7,8,9,11,12)))
            .isEqualTo(1)
    }
}
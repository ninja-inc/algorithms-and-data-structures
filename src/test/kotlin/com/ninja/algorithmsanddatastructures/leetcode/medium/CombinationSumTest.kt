package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CombinationSumTest {
    val logic = CombinationSum2()

    @Test
    fun test01() {
        assertThat(logic.combinationSum(intArrayOf(2,3,6,7), 7))
            .isEqualTo(listOf(
                listOf(7),
                listOf(2,2,3)
            ))
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FindFirstAndLastPositionOfElementInSortedArrayTest {
    val logic = FindFirstAndLastPositionOfElementInSortedArray()

    @Test
    fun test01() {
        assertThat(logic.searchRange(intArrayOf(5,7,7,8,8,10), 6)).isEqualTo(intArrayOf(-1,-1))
    }

    @Test
    fun test02() {
        assertThat(logic.searchRange(intArrayOf(2,2), 2)).isEqualTo(intArrayOf(0, 1))
    }

    @Test
    fun test03() {
        assertThat(logic.searchRange(intArrayOf(1,1,2), 1)).isEqualTo(intArrayOf(0, 1))
    }
}
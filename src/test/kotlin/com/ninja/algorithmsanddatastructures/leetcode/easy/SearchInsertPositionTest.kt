package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchInsertPositionTest {
    private val searchInsertPosition = SearchInsertPosition()

    @Test
    fun test01() {
        assertThat(searchInsertPosition.searchInsert(
            intArrayOf(1,3,5,6),
            7
        )).isEqualTo(4)
    }

    @Test
    fun test02() {
        assertThat(searchInsertPosition.searchInsert(
            intArrayOf(1,3,5,6),
            2
        )).isEqualTo(1)
    }
}
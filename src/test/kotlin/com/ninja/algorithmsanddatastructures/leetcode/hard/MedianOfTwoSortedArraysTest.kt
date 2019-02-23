package com.ninja.algorithmsanddatastructures.leetcode.hard

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MedianOfTwoSortedArraysTest {
    private val logic = MedianOfTwoSortedArrays()

    @Test
    fun test1() {
        assertThat(logic.run(arrayOf(1, 3), arrayOf(2)))
                .isEqualTo(2.0)
    }

    @Test
    fun test2() {
        assertThat(logic.run(arrayOf(1, 2), arrayOf(3, 4)))
                .isEqualTo(2.5)
    }
}
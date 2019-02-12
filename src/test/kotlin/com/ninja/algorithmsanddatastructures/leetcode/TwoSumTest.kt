package com.ninja.algorithmsanddatastructures.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {
    private val twoSum = TwoSum()

    @Test
    fun test1() {
        assertThat(twoSum.run(listOf(2,7,11,15), 9)).isEqualTo(listOf(0,1))
    }

    @Test
    fun test2() {
        assertThat(twoSum.run2(listOf(2,7,11,15), 9)).isEqualTo(listOf(0,1))
    }

    @Test
    fun test3() {
        assertThat(twoSum.run3(listOf(2,7,11,15), 9)).isEqualTo(listOf(0,1))
    }
}
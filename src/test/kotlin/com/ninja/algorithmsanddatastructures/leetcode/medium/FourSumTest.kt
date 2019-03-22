package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FourSumTest {
    private val logic = FourSum()

    @Test
    fun test01() {
        assertThat(logic.run(listOf(1, 0, -1, 0, -2, 2), 0))
                .containsAll(listOf(
                        listOf(-1,  0, 0, 1),
                        listOf(-2, -1, 1, 2),
                        listOf(-2,  0, 0, 2)
                ))
    }
}
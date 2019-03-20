package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreeSumTest {
    val logic = ThreeSum()

    @Test
    fun test01() {
        assertThat(logic.run(listOf(-1, 0, 1, 2, -1, -4)))
                .containsAll(listOf(
                        listOf(-1, 0, 1),
                        listOf(-1, -1, 2)
                ))
    }
}
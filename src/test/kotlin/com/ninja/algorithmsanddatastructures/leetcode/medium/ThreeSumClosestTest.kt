package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreeSumClosestTest {
    val logic = ThreeSumClosest()

    @Test
    fun test01() {
        assertThat(logic.run(listOf(-1, 2, 1, -4), 1))
                .isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(logic.run2(listOf(-1, 2, 1, -4), 1))
                .isEqualTo(2)
    }

    @Test
    fun test03() {
        assertThat(logic.run3(listOf(-1, 2, 1, -4), 1))
                .isEqualTo(2)
    }
}
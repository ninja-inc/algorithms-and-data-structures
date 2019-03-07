package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContainerWithMostWaterTest {
    private val logic = ContainerWithMostWater()

    @Test
    fun test01() {
        assertThat(logic.run(listOf(1,8,6,2,5,4,8,3,7)))
                .isEqualTo(49)
    }

    @Test
    fun test02() {
        assertThat(logic.twoPointerApproach(listOf(1,8,6,2,5,4,8,3,7)))
                .isEqualTo(49)
    }
}

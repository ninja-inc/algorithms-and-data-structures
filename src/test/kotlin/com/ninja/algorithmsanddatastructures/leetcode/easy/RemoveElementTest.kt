package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemoveElementTest {
    private val logic = RemoveElement()

    @Test
    fun test01() {
        val nums = intArrayOf(3,2,2,3)

        assertThat(logic.removeElement(nums, 3)).isEqualTo(2)

        val ans = intArrayOf(2,2)

        println(nums)

        for (i in 0 until 2)
            assertThat(nums[i]).isEqualTo(ans[i])
    }

    @Test
    fun test02() {
        val nums = intArrayOf(0,1,2,2,3,0,4,2)

        assertThat(logic.removeElement(nums, 2)).isEqualTo(5)

        println(nums.joinToString())

        val ans = intArrayOf(0,1,3,0,4)

        for (i in 0 until 5)
            assertThat(nums[i]).isEqualTo(ans[i])
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class RemoveDuplicatesFromSortedArrayTest {
    val logic = RemoveDuplicatesFromSortedArray()

    @Test
    fun test01() {
        val input = intArrayOf(1,1,2)
        val len = logic.removeDuplicates(input)

        var ans = ""
        for (i in 0 until len)
            ans += input[i]

        assertAll(
            { assertThat(len).isEqualTo(2) },
            { assertThat(ans).isEqualTo("12") }
        )
    }

    @Test
    fun test02() {
        val input = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val len = logic.removeDuplicates(input)

        var ans = ""
        for (i in 0 until len)
            ans += input[i]

        assertAll(
            { assertThat(len).isEqualTo(5) },
            { assertThat(ans).isEqualTo("01234") }
        )
    }
}
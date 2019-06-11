package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DivideTwoIntegersTest {
    val logic = DivideTwoIntegers()

    @Test
    fun test00() {
        assertThat(logic.divide(20,1)).isEqualTo(20)
    }

    @Test
    fun test01() {
        assertThat(logic.divide(10,3)).isEqualTo(3)
    }

    @Test
    fun test02() {
        assertThat(logic.divide(659,-11)).isEqualTo(-59)
    }

    @Test
    fun test03() {
        assertThat(logic.divide(-2147483648,-1)).isEqualTo(Int.MAX_VALUE)
    }
}
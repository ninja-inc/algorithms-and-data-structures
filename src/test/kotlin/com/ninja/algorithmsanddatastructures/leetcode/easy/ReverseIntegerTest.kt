package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReverseIntegerTest {
    private val logic = ReverseInteger()

    @Test
    fun test01() {
        assertThat(logic.run(123)).isEqualTo(321)
    }

    @Test
    fun test02() {
        assertThat(logic.run(-123)).isEqualTo(-321)
    }

    @Test
    fun test03() {
        assertThat(logic.run(120)).isEqualTo(21)
    }
}

package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringToIntegerAtoiTest {
    private val logic = StringToIntegerAtoi()

    @Test
    fun test01() {
        assertThat(logic.run("42")).isEqualTo(42)
    }

    @Test
    fun test02() {
        assertThat(logic.run("   -42")).isEqualTo(-42)
    }

    @Test
    fun test03() {
        assertThat(logic.run("4193 with words")).isEqualTo(4193)
    }

    @Test
    fun test04() {
        assertThat(logic.run("words and 987")).isEqualTo(0)
    }

    @Test
    fun test05() {
        assertThat(logic.run("-91283472332")).isEqualTo(-2147483648)
    }
}

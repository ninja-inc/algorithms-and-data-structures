package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RomanToIntegerTest {
    private val logic = RomanToInteger()

    @Test
    fun test01() {
        assertThat(logic.run("III")).isEqualTo(3)
    }

    @Test
    fun test02() {
        assertThat(logic.run("IV")).isEqualTo(4)
    }

    @Test
    fun test03() {
        assertThat(logic.run("IX")).isEqualTo(9)
    }

    @Test
    fun test04() {
        assertThat(logic.run("LVIII")).isEqualTo(58)
    }

    @Test
    fun test05() {
        assertThat(logic.run("MCMXCIV")).isEqualTo(1994)
    }
}
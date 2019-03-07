package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegerToRomanTest {
    private val logic = IntegerToRoman()

    @Test
    fun test01() {
        assertThat(logic.run(3)).isEqualTo("III")
    }

    @Test
    fun test02() {
        assertThat(logic.run(4)).isEqualTo("IV")
    }

    @Test
    fun test03() {
        assertThat(logic.run(9)).isEqualTo("IX")
    }

    @Test
    fun test04() {
        assertThat(logic.run(58)).isEqualTo("LVIII")
    }

    @Test
    fun test05() {
        assertThat(logic.run(1994)).isEqualTo("MCMXCIV")
    }
}

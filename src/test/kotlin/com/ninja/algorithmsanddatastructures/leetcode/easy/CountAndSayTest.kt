package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountAndSayTest {
    val logic = CountAndSay()

    @Test
    fun test01() {
        assertThat(logic.countAndSay(2)).isEqualTo("11")
    }

    @Test
    fun test02() {
        assertThat(logic.countAndSay(3)).isEqualTo("21")
    }

    @Test
    fun test03() {
        assertThat(logic.countAndSay(4)).isEqualTo("1211")
    }

    @Test
    fun test04() {
        assertThat(logic.countAndSay(5)).isEqualTo("111221")
    }
}

package com.ninja.algorithmsanddatastructures.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ImplementStrStrTest {
    private val logic = ImplementStrStr()

    @Test
    fun test01() {
        assertThat(logic.strStr("hello", "ll")).isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(logic.strStr("aaaaa", "bba")).isEqualTo(-1)
    }

    @Test
    fun test03() {
        assertThat(logic.strStr("mississippi", "issipi")).isEqualTo(-1)
    }
}

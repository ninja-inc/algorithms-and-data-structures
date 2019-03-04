package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZigZagConversionTest {
    private val zigZagConversion = ZigZagConversion()

    @Test
    fun test1() {
        assertThat(zigZagConversion.run("PAYPALISHIRING", 3))
                .isEqualTo("PAHNAPLSIIGYIR")
    }

    @Test
    fun test2() {
        assertThat(zigZagConversion.run("PAYPALISHIRING", 4))
                .isEqualTo("PINALSIGYAHRPI")
    }

    @Test
    fun test21() {
        assertThat(zigZagConversion.sol1("PAYPALISHIRING", 3))
                .isEqualTo("PAHNAPLSIIGYIR")
    }

    @Test
    fun test22() {
        assertThat(zigZagConversion.sol1("PAYPALISHIRING", 4))
                .isEqualTo("PINALSIGYAHRPI")
    }
}
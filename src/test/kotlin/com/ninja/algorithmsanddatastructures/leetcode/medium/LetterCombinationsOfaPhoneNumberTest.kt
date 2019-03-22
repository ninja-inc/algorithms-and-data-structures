package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LetterCombinationsOfaPhoneNumberTest {
    val logic = LetterCombinationsOfaPhoneNumber()

    @Test
    fun test01() {
        assertThat(logic.run("23"))
                .isEqualTo(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
    }

    @Test
    fun test02() {
        assertThat(logic.sol("23"))
                .isEqualTo(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
    }
}
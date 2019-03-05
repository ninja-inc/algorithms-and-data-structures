package com.ninja.algorithmsanddatastructures.leetcode.hard

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class RegularExpressionMatchingTest {
    private val logic = RegularExpressionMatching()

    @Test
    fun recursive() {
        assertThat(logic.recursive("aab", "c*a*b")).isTrue()
    }
}
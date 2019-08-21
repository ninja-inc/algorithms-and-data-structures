package com.ninja.algorithmsanddatastructures.hackerrank.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NonDivisibleSubsetKtTest {
    @Test
    fun test01() {
        assertThat(nonDivisibleSubset(3, arrayOf(1,7,2,4))).isEqualTo(3)
    }


    //@Test
    fun test11() {
        assertThat(Pair(1,2)).isNotEqualTo(Pair(2,1))
        assertThat(Pair(1,2)).isEqualTo(Pair(1,2))
    }
}
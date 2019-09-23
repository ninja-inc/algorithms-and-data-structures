package com.ninja.algorithmsanddatastructures.hackerrank.datastructures.medium

import com.ninja.algorithmsanddatastructures.hackerrank.datastructures.medium.matchingStrings
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SparseArraysKtTest {
    @Test
    fun test01() {
        assertThat(matchingStrings(
            arrayOf("def", "de", "fgh"),
            arrayOf("de", "lmn", "fgh")
        )).isEqualTo(arrayOf(1, 0, 1))
    }
}
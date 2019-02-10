package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestCommonSubSequenceTest {
    private val lcs = LongestCommonSubSequence();

    @Test
    fun test1() {
        assertThat(lcs.run("ABCDGH", "AEDFHR"))
                .isEqualTo("ADH")
    }

    @Test
    fun test2() {
        assertThat(lcs.run("AGGTAB", "GXTXAYB"))
                .isEqualTo("GTAB")
    }
}
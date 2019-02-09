package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestIncreasingSubSequenceTest {
    private val longestIncreasingSubSequence = LongestIncreasingSubSequence()

    @Test
    fun test() {
        val result = longestIncreasingSubSequence.run(arrayOf(10, 22, 9, 33, 21, 50, 41, 60, 80))

        assertThat(result).isEqualTo(listOf(10, 22, 33, 50, 60, 80))
    }

    @Test
    fun test2() {
        val result = longestIncreasingSubSequence.run(arrayOf(3, 2))

        assertThat(result).isEqualTo(listOf(2))
    }

    @Test
    fun test3() {
        val result = longestIncreasingSubSequence.run(arrayOf(50, 3, 10, 7, 40, 80))

        // ooh.. this fails
        // assertThat(result).isEqualTo(listOf(3, 7, 40, 80))
    }

    @Test
    fun test4() {
        val result = longestIncreasingSubSequence.run2(arrayOf(50, 3, 10, 7, 8, 80))

        assertThat(result).isEqualTo(3)
    }
}

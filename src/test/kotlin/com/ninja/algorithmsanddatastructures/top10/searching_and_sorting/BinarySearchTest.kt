package com.ninja.algorithmsanddatastructures.top10.searching_and_sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BinarySearchTest {
    private val binarySearch = BinarySearch()

    @Test
    fun test1() {
        val ans = (binarySearch.run(
                listOf(2, 5, 8, 12, 16, 23, 38, 56, 72, 91),
                23
        ))

        assertThat(ans).isEqualTo(23)
    }

    @Test
    fun test2() {
        val ans = (binarySearch.run(
                listOf(2, 5, 8, 12, 16, 23, 38, 56, 72, 91),
                38
        ))

        assertThat(ans).isEqualTo(38)
    }

    @Test
    fun test3() {
        val ans = (binarySearch.run(
                listOf(2, 5, 8, 12, 16, 23, 38, 56, 72, 91),
                39
        ))

        assertThat(ans).isNull()
    }
}
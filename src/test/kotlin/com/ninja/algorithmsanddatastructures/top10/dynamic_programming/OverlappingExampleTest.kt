package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OverlappingExampleTest {
    private val overlappingExample = OverlappingExample()

    @Test
    fun recursive() {
        assertThat(overlappingExample.fibonacciRecursive(20)).isEqualTo(6765)
    }

    @Test
    fun memoization() {
        assertThat(overlappingExample.fibonacciMemoization(20)).isEqualTo(6765)
    }

    @Test
    fun tabulation() {
        assertThat(overlappingExample.fibonacciTabulation(20)).isEqualTo(6765)
    }
}

package com.ninja.algorithmsanddatastructures.top10.number_theory_and_other_mathematical

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PrimeNumberTest {
    private val primeNumber = PrimeNumber()

    @Test
    fun test01() {
        assertThat(primeNumber.test01(11)).isTrue()

        assertThat(primeNumber.test01(15)).isFalse()

        assertThat(primeNumber.test01(1)).isFalse()
    }
}

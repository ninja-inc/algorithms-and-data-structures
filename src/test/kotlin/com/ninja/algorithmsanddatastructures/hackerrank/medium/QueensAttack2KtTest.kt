package com.ninja.algorithmsanddatastructures.hackerrank.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueensAttack2KtTest {
    @Test
    fun test01() {
        val ans = queensAttack(
            n=5,
            k=3,
            r_q=4,
            c_q=3,
            obstacles = arrayOf(
                arrayOf(5,5),
                arrayOf(4,2),
                arrayOf(2,3)
            )
        )
        assertThat(ans).isEqualTo(10)
    }

    @Test
    fun test02() {
        val ans = queensAttack(
            n=4,
            k=0,
            r_q=4,
            c_q=4,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(9)
    }
}
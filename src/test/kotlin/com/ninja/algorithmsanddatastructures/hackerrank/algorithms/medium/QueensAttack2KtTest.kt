package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

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

    @Test
    fun test02_1() {
        val ans = queensAttack(
            n=5,
            k=0,
            r_q=3,
            c_q=2,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(14)
    }

    @Test
    fun test02_2() {
        val ans = queensAttack(
            n=5,
            k=0,
            r_q=2,
            c_q=3,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(14)
    }

    @Test
    fun test02_3() {
        val ans = queensAttack(
            n=5,
            k=0,
            r_q=4,
            c_q=3,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(14)
    }

    @Test
    fun test02_4() {
        val ans = queensAttack(
            n=5,
            k=0,
            r_q=3,
            c_q=4,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(14)
    }

    @Test
    fun test03() {
        val ans = queensAttack(
            n=100000,
            k=0,
            r_q=4187,
            c_q=5068,
            obstacles = arrayOf()
        )
        assertThat(ans).isEqualTo(308369)
    }
}
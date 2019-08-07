package com.ninja.algorithmsanddatastructures.hackerrank.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ClimbingTheLeaderboardKtTest {
    @Test
    fun test11() {
        assertThat(climbingLeaderboard(arrayOf(100,100,50,40,40,20,10), arrayOf(5,25,50,120)))
            .isEqualTo(arrayOf(6,4,2,1))
    }

    @Test
    fun test12() {
        assertThat(climbingLeaderboard(arrayOf(100,90,90,80,75,60), arrayOf(50,65,77,90,102)))
            .isEqualTo(arrayOf(6,5,4,2,1))
    }

    /**
    @Test
    fun test01() {
        assertThat(find(arrayOf(50, 40, 30, 20, 10), 30)).isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(find(arrayOf(50, 40, 30, 20, 10), 35)).isEqualTo(2)
    }

    @Test
    fun test03() {
        assertThat(find(arrayOf(50, 40, 30, 20, 10), 15)).isEqualTo(3)
    }

    @Test
    fun test04() {
        assertThat(find(arrayOf(50, 40, 30, 20, 10), 55)).isEqualTo(0)
    }

    @Test
    fun test05() {
        assertThat(find(arrayOf(50, 40, 30, 20, 10), 0)).isEqualTo(5)
    }
    **/
}
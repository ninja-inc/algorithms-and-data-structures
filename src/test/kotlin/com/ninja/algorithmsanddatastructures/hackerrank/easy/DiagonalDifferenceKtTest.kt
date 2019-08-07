package com.ninja.algorithmsanddatastructures.hackerrank.easy

import com.ninja.algorithmsanddatastructures.hackerrank.easy.diagonalDifference
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class DiagonalDifferenceKtTest {
    @Test
    fun test01() {
        val ans = diagonalDifference(
            arrayOf(
                arrayOf(11, 2, 4),
                arrayOf(4, 5, 6),
                arrayOf(10, 8, -12)
            )
        )

        assertThat(ans).isEqualTo(15)
    }
}
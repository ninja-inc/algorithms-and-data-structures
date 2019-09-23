package com.ninja.algorithmsanddatastructures.hackerrank.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OrganizingContainersOfBallsKtTest {
    @Test
    fun test01() {
        assertThat(organizingContainers(
            arrayOf(
                arrayOf(0,2,1),
                arrayOf(1,1,1),
                arrayOf(2,0,0)
            )
        )).isEqualTo("Possible")
    }

    @Test
    fun test02() {
        assertThat(organizingContainers(
            arrayOf(
                arrayOf(1,3,1),
                arrayOf(2,1,2),
                arrayOf(3,3,3)
            )
        )).isEqualTo("Impossible")
    }

    @Test
    fun test03() {
        assertThat(organizingContainers(
            arrayOf(
                arrayOf(0,2),
                arrayOf(1,1)
            )
        )).isEqualTo("Impossible")
    }
}
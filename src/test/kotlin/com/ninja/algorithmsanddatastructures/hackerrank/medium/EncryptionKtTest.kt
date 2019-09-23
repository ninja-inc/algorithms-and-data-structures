package com.ninja.algorithmsanddatastructures.hackerrank.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EncryptionKtTest {
    @Test
    fun test01() {
        assertThat(encryption("haveaniceday"))
            .isEqualTo("hae and via ecy")
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class PermutationsTwoTest {
    val logic = PermutationsTwo2()

    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun test01() {
        log.info(logic.permuteUnique(intArrayOf(1,1,2)).toString())
    }
}
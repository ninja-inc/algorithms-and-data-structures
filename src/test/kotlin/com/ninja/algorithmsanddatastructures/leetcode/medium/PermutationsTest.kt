package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class PermutationsTest {
    val logic = Permutations()
    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun test01() {
        log.info(logic.permute(intArrayOf(1,2,3)).toString())
    }
}
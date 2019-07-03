package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class CombinationSumTwoTest {
    val logic = CombinationSumTwo()
    val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun test01() {
        log.info("${logic.combinationSum2(intArrayOf(10,1,2,7,6,1,5), 8)}")
    }
}
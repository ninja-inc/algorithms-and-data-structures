package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class SubsetsTwoTest {
    val log = LoggerFactory.getLogger(this::class.java)
    val logic = SubsetsTwo()

    @Test
    fun test01() {
        log.info(logic.subsetsWithDup(intArrayOf(1,2,2)).toString())
    }
}
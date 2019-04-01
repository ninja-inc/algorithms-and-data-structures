package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class GenerateParenthesesTest {
    val log = LoggerFactory.getLogger(this::class.java)

    val logic = GenerateParentheses()

    @Test
    fun test01() {
        assertThat(logic.run(3))
                .containsAll(listOf(
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                ))
    }

    @Test
    fun test02() {
        assertThat(logic.run(3))
                .containsAll(listOf(
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                ))
    }
}
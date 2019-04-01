package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
class GenerateParentheses {
    // without optimization
    fun run(n: Int): List<String> {
        if (n <= 0)
            return listOf("")
        else if (n == 1)
            return listOf("()")

        val ans = mutableListOf<String>()

        for (i in 0 until n) {
            val left = run(i)
            val right = run(n - i - 1)

            for (l in left)
                for (r in right)
                    ans.add("($l)$r")
        }

        return ans
    }

    val map = mutableMapOf<Int, List<String>>()
    // dynamic programming
    fun run2(n: Int): List<String> {
        if (n <= 0)
            return listOf("")
        else if (n == 1)
            return listOf("()")

        val ans = mutableListOf<String>()

        for (i in 0 until n) {
            val left =
                    if (map[i] != null)
                        map[i]!!
                    else {
                        val result = run2(i)
                        map[i] = result
                        result
                    }

            val right =
                    if (map[n - i - 1] != null)
                        map[n - i - 1]!!
                    else {
                        val result = run2(n - i - 1)
                        map[n - i - 1] = result
                        result
                    }

            for (l in left)
                for (r in right)
                    ans.add("($l)$r")
        }

        return ans
    }
}
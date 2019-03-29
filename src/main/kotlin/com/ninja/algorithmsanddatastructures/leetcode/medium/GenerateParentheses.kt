package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
class GenerateParentheses {
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
}
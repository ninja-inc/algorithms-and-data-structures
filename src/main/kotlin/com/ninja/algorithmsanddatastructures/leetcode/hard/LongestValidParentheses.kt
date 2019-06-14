package com.ninja.algorithmsanddatastructures.leetcode.hard

import java.util.*

/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 */
class LongestValidParentheses {
    /**
     * too bad
     */
    fun longestValidParentheses(s: String): Int {
        var ans = 0
        for (i in 0 until s.length - 1) {
            for (j in i + 1 until s.length) {
                val ss = s.substring(i, j + 1)
                if (isValidParentheses(ss))
                    ans = Math.max(ans, ss.length)
            }
        }

        return ans
    }

    private fun isValidParentheses(s: String): Boolean {
        val queue = ArrayDeque<Char>()

        for (c in s) {
            when (c) {
                '(' -> {
                    queue.addFirst(c)
                }
                ')' -> {
                    if (queue.poll() == null)
                        return false
                }
            }
        }

        return queue.isEmpty()
    }
}
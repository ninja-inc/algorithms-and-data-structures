package com.ninja.algorithmsanddatastructures.leetcode.medium

import java.util.*

/**
 * https://leetcode.com/problems/palindrome-partitioning/
 */
class PalindromePartitioning {
    fun partition(s: String): List<List<String>> {
        val ans = mutableListOf<MutableList<String>>()

        backtrack(s, mutableListOf(), ans, 0)

        return ans
    }

    private fun backtrack(s: String, tmp: MutableList<String>, ans: MutableList<MutableList<String>>, start: Int) {
        if (start == s.length)
            ans.add(ArrayList(tmp))

        for (i in start .. s.length) {
            if (isPalindrome(s.substring(start, i))) {
                tmp.add(s.substring(start, i))
                backtrack(s, tmp, ans, i)
                tmp.removeAt(tmp.size - 1)
            }
        }
    }

    fun isPalindrome(s: String): Boolean {
        if (s.isBlank())
            return false

        val p = s.length / 2
        val queue = LinkedList<Char>()

        for (i in 0 until p)
            queue.addFirst(s[i])

        for (j in p + s.length%2 until s.length)
            if (s[j] != queue.pollFirst())
                return false

        return true
    }
}
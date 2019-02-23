package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 */
class LongestPalindromicSubstring {
    fun run(s: String): String {
        var ans = ""

        for (i in 0 until s.length)
            for (j in i until s.length)
                if (palindromic(s.substring(i, j)) && ans.length < j - i)
                    ans = s.substring(i, j)

        return ans
    }

    fun palindromic(s: String): Boolean {
        var i = 0
        var j = s.length - 1

        while (i < (s.length + 1) / 2) {
            if (s[i ++] != s[j --])
                return false
        }

        return true
    }
}
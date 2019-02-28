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
            for (j in i + 1 until s.length)
                if (palindromic(s.substring(i, j + 1)) && ans.length < j - i)
                    ans = s.substring(i, j + 1)

        return ans
    }

    fun palindromic(s: String): Boolean {
        var i = 0
        var j = s.length - 1

        if (s.isEmpty())
            return true

        while (i < (s.length + 1) / 2) {
            if (s[i ++] != s[j --])
                return false
        }

        return true
    }

    private lateinit var tableList: Array<Array<Boolean?>>

    fun run2(s: String): String {
        tableList = Array(s.length) { arrayOfNulls<Boolean>(s.length) }

        var ans = ""

        for (i in 0 until s.length)
            for (j in i + 1 until s.length)
                if (savedPalindromic(s, i, j) && ans.length < j - i)
                    ans = s.substring(i, j + 1)

        return ans
    }

    private fun savedPalindromic(s: String, i: Int, j: Int): Boolean {
        if (tableList[i + 1][j - 1] == null) {
            tableList[i + 1][j - 1] = palindromic(s.substring(i + 1, j - 1 + 1))
        }

        tableList[i][j] = tableList[i + 1][j - 1] == true && s[i] == s[j]

        return tableList[i][j]!!
    }
}
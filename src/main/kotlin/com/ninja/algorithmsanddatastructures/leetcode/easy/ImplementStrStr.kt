package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/implement-strstr/
 */
class ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty())
            return 0

        if (haystack.length < needle.length)
            return -1

        var tmp = 0
        for (i in 0 .. haystack.length - needle.length) {
            if (check(haystack, needle, i))
                return i
        }

        return -1
    }

    private fun check(haystack: String, needle: String, i: Int): Boolean {
        for (j in 0 until needle.length) {
            if (haystack[i + j] != needle[j])
                return false

        }

        return true
    }
}
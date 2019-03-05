package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/palindrome-number/
 */
class PalindromeNumber {
    // probably O(log10(n))
    fun run(x: Int): Boolean {

        if (x < 0)
            return false

        val str = x.toString()
        var i = 0
        var j = str.length - 1
        while(true) {
            if (i > j)
                break

            if (str[i++] != str[j--])
                return false

        }

        return true
    }
}

package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/reverse-integer/
 */
class ReverseInteger {
    fun run(x: Int): Int {
        val ans = mutableListOf<Int>()
        val isMinus = x < 0
        var tmpX = if (isMinus) x * -1 else x

        while (tmpX > 0) {
            ans.add(tmpX % 10)
            tmpX /= 10
        }

        return if (isMinus) ans.joinToString(separator = "").toInt() * -1 else ans.joinToString(separator = "").toInt()
    }
}
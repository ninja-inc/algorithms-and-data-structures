package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
class StringToIntegerAtoi {
    fun run(str: String): Int {
        var isSpaceNotAllowed = false
        var numberStarted = false
        var isMinus = false

        var ans = 0

        loop@
        for (c in str) {
            when (c) {
                '-' -> {
                    if (numberStarted || isMinus)
                        break@loop
                    isMinus = true
                    isSpaceNotAllowed = true
                }
                ' ' -> {
                    if (numberStarted || isSpaceNotAllowed)
                        break@loop
                }
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    ans = ans * 10 + c.toString().toInt()
                    isSpaceNotAllowed = true
                    numberStarted = true
                }
                else -> {
                    if (numberStarted)
                        break@loop
                    return 0
                }
            }

            if (!isMinus && ans > Int.MAX_VALUE / 10) {
                return Int.MAX_VALUE
            } else if (isMinus && ans * -1 < Int.MIN_VALUE / 10) {
                return Int.MIN_VALUE
            }
        }

        return if (isMinus) ans * -1 else ans
    }
}
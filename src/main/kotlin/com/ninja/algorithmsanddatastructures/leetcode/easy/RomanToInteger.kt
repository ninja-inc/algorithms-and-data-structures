package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
class RomanToInteger {
    private val romans = mapOf(
            "I" to 1,
            "IV" to 4,
            "V" to 5,
            "IX" to 9,
            "X" to 10,
            "XL" to 40,
            "L" to 50,
            "XC" to 90,
            "C" to 100,
            "CD" to 400,
            "D" to 500,
            "CM" to 900,
            "M" to 1000
    )

    fun run(str: String): Int {
        var ans = 0

        var skip = false
        for (i in 0 until str.length) {
            if (skip) {
                skip = false
                continue
            }

            var tmp = if (i < str.length - 1 && (str[i] == 'I' || str[i] == 'X' || str[i] == 'C')) str[i].toString() + str[i+1].toString() else ""

            val num = romans[tmp]
            if (num != null) {
                ans += num
                skip = true
            } else
                ans += romans[str[i].toString()]!!
        }

        return ans
    }
}
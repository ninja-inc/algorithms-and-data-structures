package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/integer-to-roman/
 */
class IntegerToRoman {
    private val romans = mapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X",
            40 to "XL",
            50 to "L",
            90 to "XC",
            100 to "C",
            400 to "CD",
            500 to "D",
            900 to "CM",
            1000 to "M"
    ).entries.sortedByDescending { entry -> entry.key }

    fun run(num: Int): String {

        var tmpNum = num
        var ans = ""
        for (roman in romans) {
            val a = tmpNum / roman.key
            for (i in 0 until a) {
                tmpNum -= roman.key
                ans += roman.value
            }
            if (tmpNum == 0)
                break
        }

        return ans
    }
}

package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/divide-two-integers/
 */
class DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        val isMinus = !((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0))

        val ddividend = if (dividend < 0) {
            dividend.toString().removePrefix("-")
        } else dividend.toString()

        val ddivisor = if (divisor < 0) {
            divisor.toString().removePrefix("-")
        } else divisor.toString()

        if (ddividend.toLong() < ddivisor.toLong())
            return 0

        var firstNum = getNum(ddividend.toString(), ddivisor.toString().length)

        var ans = ""

        var cnt = 0
        while (firstNum >= ddivisor.toLong()) {
            firstNum -= ddivisor.toLong()
            cnt ++
        }

        ans = cnt.toString()

        for (i in ddivisor.toString().length until ddividend.toString().length) {
            firstNum = (firstNum.toString() + ddividend.toString()[i]).toLong()

            cnt = 0
            while (firstNum >= ddivisor.toLong()) {
                firstNum -= ddivisor.toLong()
                cnt ++
            }

            ans += cnt.toString()
        }

        val lans = if (isMinus) ans.toLong() * -1 else ans.toLong()
        if (lans < Int.MIN_VALUE || lans > Int.MAX_VALUE)
            return Int.MAX_VALUE
        else
            return lans.toInt()
    }

    private fun getNum(s: String, i: Int): Long {
        var num = ""
        for (j in 0 until i)
            num += s[j]

        return num.toLong()
    }
}
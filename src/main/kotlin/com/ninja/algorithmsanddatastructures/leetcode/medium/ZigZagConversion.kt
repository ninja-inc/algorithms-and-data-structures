package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/zigzag-conversion/solution/
 */
class ZigZagConversion {
    private lateinit var table: Array<Array<Char?>>

    fun run(s: String, n: Int): String {
        table = Array(s.length) { arrayOfNulls<Char>(s.length) }

        var w = 0
        var i = 0

        loop@
        while(true) {
            for (h in 0 until n) {
                if (i == s.length)
                    break@loop

                table[h][w] = s[i++]
            }

            for (h in n - 2 downTo 1) {
                if (i == s.length)
                    break@loop

                table[h][++w] = s[i++]
            }

            w++
        }

        var ans = ""
        w = 0
        for (h in 0 until s.length)
            for (w in 0 until s.length)
                if (table[h][w] != null)
                    ans += table[h][w]

        return ans
    }
}

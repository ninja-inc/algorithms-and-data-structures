package com.ninja.algorithmsanddatastructures.leetcode.medium

import java.time.LocalDate

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


    fun sol1(s: String, n: Int): String {
        if (n == 1)
            return s

        val rows: MutableList<String> = ArrayList()
        for (i in 0 .. Math.min(n, s.length))
            rows.add("")
        
        var curRow = 0
        var goingDown = false
        
        for (c in s) {
            rows[curRow] += c.toString()
            
            if (curRow == 0 || curRow == n - 1)
                goingDown = !goingDown

            curRow += if (goingDown) 1 else -1
        }

        return rows.reduce { acc, s1 -> acc.plus(s1) }
    }
}

data class Member(
        val name: String = "NinjaCTO",
        val age: Int = 29,
        val birthDate: LocalDate = LocalDate.now()
)
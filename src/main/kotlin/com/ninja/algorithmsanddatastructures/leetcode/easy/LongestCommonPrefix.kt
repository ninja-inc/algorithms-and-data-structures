package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class LongestCommonPrefix {
    fun run(strs: List<String>): String {
        val min = strs.map { it.length }.min()

        var ans = ""

        loop@
        for (i in 0 until min!!) {
            for (j in 1 until strs.size)
                if (strs[0][i] != strs[j][i])
                    break@loop
            ans += strs[i][i]
        }

        return ans
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.medium

import kotlin.math.max

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty())
            return 0

        var ans = 1
        val map = mutableMapOf<Char, Boolean>()

        var l = 0
        var r = 0
        while (r < s.length) {
            if (map[s[r]] == true) {
                map[s[l]] = false
                l++

            } else {
                ans = max(ans, r - l + 1)
                map[s[r]] = true
                r++
            }
        }

        return ans
    }


    fun lengthOfLongestSubstring2(s: String): Int {
        var ans = 0

        for (l in 0 until s.length) {
            for (r in l + 1 .. s.length) {
                val sub = s.substring(l, r)
                if (isNotDuplicated(sub))
                    ans = max(ans, r - l)
                else
                    break

            }
        }

        return ans
    }

    private fun isNotDuplicated(s: String): Boolean {
        val map = mutableMapOf<Char, Boolean>()

        for (i in 0 until s.length) {
            if (map[s[i]] == true)
                return false
            else
                map[s[i]] = true
        }

        return true
    }


    fun run(s: String): String {
        val map = mutableMapOf<Int, String>()

        for (i in 0 until s.length) {
            loop@
            for (j in i + 1 until s.length) {
                when {
                    map[i] == null -> {
                        if (s[i] == s[j]) {
                            map[i] = "${s[i]}"
                            break@loop
                        } else
                            map[i] = "${s[i]}${s[j]}"
                    }
                    map[i]!!.contains(s[j]) -> break@loop
                    else -> map[i] = "${map[i]}${s[j]}"
                }
            }
        }

        return map.entries
                .map { e -> e.value }
                .sortedBy { ss -> ss.length }
                .last()
    }

    fun slidingWindow(s: String): Int {
        val set = mutableSetOf<Char>()

        var ans = 0
        var i = 0
        var j = 0

        while (i < s.length && j < s.length) {
            if (!set.contains(s[j])) {
                set.add(s[j++])
                ans = Math.max(ans, j-i)
            } else {
                set.remove(s[i++])
            }
        }

        return ans
    }


    /*
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isBlank())
            return 0

        if (s.length < 2)
            return 1

        val anss = mutableListOf<String>()

        for (i in 0 until s.length - 1) {
            var ans = s[i].toString()
            val map = mutableMapOf<Char, Boolean>()
            for (j in i + 1 until s.length) {
                if (map[s[i]] != true) {
                    ans += s[i]
                    map[s[i]] = true
                } else {
                    anss.add(ans)
                    break
                }
            }
        }

        return anss.maxBy { it.length }!!.length
    }
    */
}

package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class LongestSubstringWithoutRepeatingCharacters {
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

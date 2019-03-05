package com.ninja.algorithmsanddatastructures.leetcode.hard

/**
 * https://leetcode.com/problems/regular-expression-matching/
 */
class RegularExpressionMatching {
    fun recursive(text: String, pattern: String): Boolean {
        if (pattern.isEmpty())
            return text.isEmpty()

        val firstMatch = !text.isEmpty()
                && pattern[0] == text[0] || pattern[0] == '.'

        return if (pattern.length >= 2 && pattern[1] == '*')
            recursive(text, pattern.substring(2))
                    || firstMatch && recursive(text.substring(1), pattern)
        else
            firstMatch
                    && recursive(text.substring(1), pattern.substring(1))

    }
}

package com.ninja.algorithmsanddatastructures.leetcode.easy

import java.util.*

class ValidParentheses {
    val map = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
    )

    fun run(s: String): Boolean {

        val queue: Deque<Char> = LinkedList()

        for (c in s) {
            when (c) {
                '(', '{', '[' -> {
                    queue.addFirst(c)
                }

                ')', '}', ']' -> {
                    if (map[c] != queue.pollFirst())
                        return false
                }
            }
        }

        return true
    }
}
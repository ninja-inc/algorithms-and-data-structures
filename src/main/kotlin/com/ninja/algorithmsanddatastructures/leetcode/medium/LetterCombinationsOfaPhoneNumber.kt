package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
class LetterCombinationsOfaPhoneNumber {
    val map = mapOf(
            '2' to listOf("a", "b", "c"),
            '3' to listOf("d", "e", "f"),
            '4' to listOf("g", "h", "i"),
            '5' to listOf("j", "k", "l"),
            '6' to listOf("m", "n", "o"),
            '7' to listOf("p", "q", "r", "s"),
            '8' to listOf("t", "u", "v"),
            '9' to listOf("w", "x", "y", "z")
    )

    fun run(digits: String): List<String> {
        val tables: List<List<String>> = digits
                .map { map[it]!! }
                .toList()

        val ans = mutableListOf<String>()

        val indices = mutableListOf<Int>()
        for (i in 0 until  tables.size)
            indices.add(0)

        loop@
        while (true) {
            var str = ""
            for (i in 0 until tables.size) {
                str += tables[i][indices[i]]

            }
            ans.add(str)

            if (indices[0] == tables[0].size -1
                    && indices[tables.size - 1] == tables[tables.size - 1].size - 1)
                break@loop

            updateIndices(indices, tables)
        }

        return ans
    }

    private fun updateIndices(indices: MutableList<Int>, tables: List<List<String>>) {
        var isPlus = false

        for (i in tables.size - 1 downTo 0) {
            if (i != tables.size - 1 && !isPlus) {
                break
            } else if (indices[i] == tables[i].size - 1) {
                indices[i] = 0
                isPlus = true
            } else if (indices[i] < tables[i].size - 1)
                indices[i] ++
        }
    }



    val phone = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
    )

    lateinit var output: MutableList<String>
    fun sol(digits: String): List<String> {
        output = mutableListOf()

        if (digits.isNotEmpty())
            backTrack("", digits)

        return output
    }

    private fun backTrack(combination: String, nextDigits: String) {
        if (nextDigits.isEmpty())
            output.add(combination)

        else {
            val digit = nextDigits[0]
            val letters = phone[digit]

            for (i in 0 until letters!!.length) {
                val letter = phone[digit]!![i]
                backTrack(combination + letter, nextDigits.substring(1))
            }
        }
    }
}
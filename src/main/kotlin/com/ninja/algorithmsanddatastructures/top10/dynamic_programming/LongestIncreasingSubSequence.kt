package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

/**
 * https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 */
class LongestIncreasingSubSequence {
    fun run(array: Array<Int>): List<Int> {
        val result = mutableMapOf<Int, List<Int>>()

        for (i in 0 until array.size) {
            var s = array[i]
            val tmpResult = mutableListOf<Int>()
            tmpResult.add(s)

            for (n in i until array.size) {
                if (s < array[n]) {
                    s = array[n]
                    tmpResult.add(s)
                }
            }

            result[i] = tmpResult
        }

        return result.entries
                .map { e -> e.value }
                .sortedBy { l -> l.size }
                .last()
    }

    fun run2(array: Array<Int>): Int {
        val tmpResult = mutableMapOf<Int, Int>()

        tmpResult[array.size - 1] = 0
        for (i in array.size - 2 downTo 0) {
            val tmpAns = mutableMapOf<Int, Int>()

            for (n in i + 1 until array.size) {

                if (array[i] < array[n]) {
                    tmpAns[n] = tmpResult[n]!!
                }

                val ans: Int? = tmpAns.entries
                        .sortedBy { e -> e.value }
                        .map { e -> e.value }
                        .lastOrNull()

                tmpResult[i] = if (ans != null) ans + 1 else 0

            }

        }

        println("$tmpResult")

        return tmpResult.entries
                .sortedBy { e -> e.value }
                .map { e -> e.value }
                .last()
    }
}
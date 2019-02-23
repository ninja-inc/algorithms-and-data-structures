package com.ninja.algorithmsanddatastructures.leetcode.hard

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * optimized solution is difficult..
 */
class MedianOfTwoSortedArrays {
    fun run(a1: Array<Int>, a2: Array<Int>): Double {

        val medianLength = (a1.size + a2.size + 1) / 2
        var i = 0
        var j = 0
        val mergedList = mutableListOf<Int>()

        while(mergedList.size < medianLength + 1) {
            if (i == a1.size) {
                mergedList.add(a2[j++])

            } else if (j == a2.size) {
                mergedList.add(a1[i++])

            } else if (a1[i] < a2[j]) {
                mergedList.add(a1[i++])

            } else {
                mergedList.add(a2[j++])
            }
        }

        if ((a1.size + a2.size) % 2 == 0) {
            return (mergedList[mergedList.size - 1].toDouble() + mergedList[mergedList.size - 2].toDouble()) / 2

        } else {
            return mergedList[mergedList.size - 2].toDouble()

        }
    }
}
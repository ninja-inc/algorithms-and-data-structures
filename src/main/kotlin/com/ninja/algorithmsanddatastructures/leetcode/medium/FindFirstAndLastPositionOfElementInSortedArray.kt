package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.slf4j.LoggerFactory

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
class FindFirstAndLastPositionOfElementInSortedArray {
    private val log = LoggerFactory.getLogger(this::class.java)

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val pivot = find(nums, target)

        if (pivot == -1)
            return intArrayOf(-1, -1)

        var s = pivot
        var e = pivot

        var sdone = false
        var edone = false

        while (true) {
            if (s - 1 >= 0 && nums[s - 1] == target)
                s--
            else
                sdone = true

            if (e + 1 < nums.size && nums[e + 1] == target)
                e++
            else
                edone = true

            if (sdone && edone)
                break
        }

        return intArrayOf(s, e)
    }

    private fun find(nums: IntArray, target: Int): Int {
        var s = 0
        var e = nums.size - 1
        while (true) {
            if (s > e)
                return -1

            val pivot = (s + e) / 2

            when {
                nums[pivot] == target -> return pivot
                nums[pivot] < target -> s = pivot + 1
                else -> e = pivot - 1
            }
        }
    }
}
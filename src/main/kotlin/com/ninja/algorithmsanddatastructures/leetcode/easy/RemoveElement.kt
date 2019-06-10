package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/remove-element/
 */
class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val v = `val`

        var current = 0

        for (head in 0 until nums.size) {

            if (nums[head] != v) {
                nums[current++] = nums[head]
            }
        }

        return current
    }
}
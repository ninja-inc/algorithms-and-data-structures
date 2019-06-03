package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty())
            return 0

        var tmp = nums[0]
        var head = 1
        for (i in 0 until nums.size) {
           if (tmp != nums[i]) {
               nums[head++] = nums[i]
               tmp = nums[i]
           }
        }

        return head
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.easy

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var r = 0
        var l = nums.size - 1
        var pivot = 0

        while (r <= l) {
            pivot = (r + l) / 2

            when {
                nums[pivot] == target ->
                    return pivot

                nums[pivot] < target ->
                    r = pivot + 1

                nums[pivot] > target ->
                    l = pivot - 1
            }
        }


        return r
    }
}
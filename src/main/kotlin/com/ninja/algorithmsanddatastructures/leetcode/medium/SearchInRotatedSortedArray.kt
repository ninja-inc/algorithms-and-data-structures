package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty())
            return -1

        if (nums.size == 1)
            return if (nums[0] == target) 0 else -1

        var i = 0
        var j = nums.size - 1
        var pivot = -1

        loop@
        while (true) {
            if (j - i == 1) {
                if (nums[j] == target) {
                    return j
                } else if (nums[i] == target) {
                    return i
                } else {
                    return -1
                }

            }

            pivot = (i + j) / 2

            if (nums[pivot] == target) {
                return pivot
            } else if (nums[pivot] < target) {
                // 6,7,1,[2],3,4,5  target: 4
                when {
                    nums[j] < target ->
                        j = pivot

                    else ->
                        i = pivot
                }
            } else {
                // 1,[3],5  target:1
                when {
                    nums[i] < target ->
                        j = pivot

                    else ->
                        i = pivot
                }
            }
        }
    }

    fun search2(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size - 1
        var pivot = -1

        loop@
        while (true) {
            if (i > j)
                return -1

            pivot = (i + j) / 2

            if (nums[pivot] == target) {
                break@loop
            } else if (nums[pivot] < target) {
                i = pivot + 1
            } else {
                j = pivot
            }
        }

        return pivot
    }
}
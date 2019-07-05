package com.ninja.algorithmsanddatastructures.leetcode.hard

class FirstMissingPositive {
    fun firstMissingPositive(nums: IntArray): Int {
        if (nums.isEmpty())
            return 1

        nums.sort()

        var isNotOne = false
        var isFirstAccess = true

        for (i in 0 until nums.size) {
            if (nums[i] < 1)
                continue
            else {
                isNotOne = true

                if (isFirstAccess && nums[i] != 1) {
                    return 1
                }

                if (!isFirstAccess && i > 0 && nums[i] - nums[i - 1] > 1)
                    return nums[i - 1] + 1

                isFirstAccess = false
            }
        }

        return if (isNotOne)
            nums[nums.size - 1] + 1
        else
            1
    }
}
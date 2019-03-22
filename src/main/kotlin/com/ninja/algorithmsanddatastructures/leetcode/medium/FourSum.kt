package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/4sum/
 */
class FourSum {
    fun run(originalNums: List<Int>, target: Int): List<List<Int>> {
        val nums = originalNums.sorted()

        val ans = mutableSetOf<List<Int>>()

        for (i in 0 until nums.size - 3) {
            for (j in i + 1 until nums.size - 2) {
                var l = j + 1
                var r = nums.size - 1

                loop@
                while (l < r) {
                    if (nums[i] + nums[j] + nums[l] + nums[r] == target) {
                        ans.add(listOf(nums[i], nums[j], nums[l], nums[r]))
                        break@loop

                    } else if (nums[i] + nums[j] + nums[l] + nums[r] < target)
                        l ++

                    else
                        r --
                }
            }
        }

        return ans.toList()
    }
}

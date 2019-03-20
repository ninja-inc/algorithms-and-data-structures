package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/3sum/
 */
class ThreeSum {
    fun run(nums: List<Int>): List<List<Int>> {
        val map = mutableMapOf<Int, Boolean>()
        for (num in nums)
            map[num] = true

        val ans = mutableSetOf<List<Int>>()

        for (i in 0 until nums.size - 1)
            for (j in i + i until nums.size)
                if (map[0 - nums[i] - nums[j]] == true)
                    ans.add(listOf(nums[i], nums[j], 0 - nums[i] - nums[j]).sorted())

        return ans.toList()
    }
}
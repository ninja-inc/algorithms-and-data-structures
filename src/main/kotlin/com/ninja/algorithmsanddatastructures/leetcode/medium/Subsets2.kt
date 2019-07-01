package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/subsets-ii/
 */
class SubsetsTwo {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        nums.sort()

        backtrack(0, mutableListOf(), ans, nums)

        return ans
    }

    private fun backtrack(start: Int, tmp: MutableList<Int>, ans: MutableList<MutableList<Int>>, nums: IntArray) {
        ans.add(ArrayList(tmp))

        var prevVal: Int? = null

        for (s in start until nums.size) {
            if (prevVal != nums[s]) {
                tmp.add(nums[s])
                backtrack(s + 1, tmp, ans, nums)
                tmp.removeAt(tmp.size - 1)
                prevVal = nums[s]
            }
        }
    }
}
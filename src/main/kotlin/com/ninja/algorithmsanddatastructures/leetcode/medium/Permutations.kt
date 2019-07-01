package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/permutations/
 */
class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(mutableListOf(), nums.toMutableList(), ans)

        return ans
    }

    private fun backtrack(tmp: MutableList<Int>, nums: MutableList<Int>, ans: MutableList<MutableList<Int>>) {
        if (nums.isEmpty())
            ans.add(tmp)

        for (start in 0 until nums.size) {
            tmp.add(nums[start])
            backtrack(tmp.toMutableList(), nums.filter { !tmp.contains(it) }.toMutableList(), ans)
            tmp.removeAt(tmp.size - 1)
        }
    }
}
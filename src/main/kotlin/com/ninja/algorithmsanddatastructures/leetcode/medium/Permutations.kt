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

class Permutations2 {
    fun permute(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(mutableListOf(), nums.toMutableList(), ans)

        return ans
    }

    private fun backtrack(tmp: MutableList<Int>, nums: MutableList<Int>, ans: MutableList<MutableList<Int>>) {
        if (tmp.size == nums.size)
            ans.add(ArrayList(tmp))
        else {
            for (i in 0 until nums.size) {
                if (tmp.contains(nums[i]))
                    continue

                tmp.add(nums[i])
                backtrack(tmp, nums, ans)
                tmp.removeAt(tmp.size - 1)
            }
        }
    }
}
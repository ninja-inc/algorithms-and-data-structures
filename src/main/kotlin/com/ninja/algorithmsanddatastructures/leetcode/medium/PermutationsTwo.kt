package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/permutations-ii/submissions/
 */
class PermutationsTwo2 {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(mutableListOf(), mutableListOf(), nums.toMutableList(), ans)

        return ans.distinct()
    }

    private fun backtrack(usedIndices: MutableList<Int>, tmp: MutableList<Int>, nums: MutableList<Int>, ans: MutableList<MutableList<Int>>) {
        if (tmp.size == nums.size)
            ans.add(ArrayList(tmp))
        else {
            for (i in 0 until nums.size) {
                if (usedIndices.contains(i))
                    continue

                usedIndices.add(i)

                tmp.add(nums[i])
                backtrack(usedIndices, tmp, nums, ans)
                tmp.removeAt(tmp.size - 1)
                usedIndices.removeAt(usedIndices.size - 1)
            }
        }
    }
}

class PermutationsTwo {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(mutableListOf(), nums.toMutableList(), ans)

        return ans.distinct()
    }

    private fun backtrack(tmp: MutableList<Int>, nums: MutableList<Int>, ans: MutableList<MutableList<Int>>) {
        if (nums.isEmpty())
            ans.add(tmp)

        for (start in 0 until nums.size) {
            tmp.add(nums[start])
            val tmpNums = ArrayList(nums)
            tmpNums.removeAt(start)
            backtrack(tmp.toMutableList(), tmpNums, ans)
            tmp.removeAt(tmp.size - 1)
        }
    }
}
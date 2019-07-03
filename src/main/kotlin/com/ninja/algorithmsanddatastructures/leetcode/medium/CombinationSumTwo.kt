package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/combination-sum-ii/
 */
class CombinationSumTwo {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(candidates.sorted().toIntArray(), target, ans, mutableListOf(), 0)

        return ans
    }

    private fun backtrack(candidates: IntArray, target: Int, ans: MutableList<MutableList<Int>>, tmp: MutableList<Int>, start: Int) {

        for (i in start until candidates.size) {
            if (target == candidates[i]) {
                tmp.add(candidates[i])
                ans.add(ArrayList(tmp))
                tmp.removeAt(tmp.size - 1)
                return

            } else if (target < candidates[i]) {
                return

            } else {
                if (i > start && candidates[i] == candidates[i-1])
                    continue

                tmp.add(candidates[i])
                backtrack(candidates, target - candidates[i], ans, tmp, i + 1)
                tmp.removeAt(tmp.size - 1)
            }
        }
    }
}
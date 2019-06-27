package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/combination-sum/
 */
class CombinationSum {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        for (i in 0 until candidates.size) {
            val res = calc(i, candidates, target)
            ans.addAll(res)
        }

        return ans.map { it.sorted() }
            .distinct()
            .toList()
    }

    private fun calc(index: Int, candidates: IntArray, target: Int): MutableList<MutableList<Int>> {
        val tmpAns = mutableListOf<MutableList<Int>>()

        for (i in index until candidates.size) {
            if (candidates[i] == target) {
                tmpAns.add(mutableListOf(candidates[i]))
            } else if (target - candidates[i] > 0) {
                val res = calc(i, candidates, target - candidates[i])

                res.forEach { it.add(candidates[i]) }

                tmpAns.addAll(res)
            } else {
                tmpAns.add(mutableListOf(-1))
            }
        }

        return tmpAns.filter { !it.contains(-1) }.toMutableList()
    }
}




class CombinationSumBad {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        for (i in 0 until candidates.size) {
            val res = calc(candidates, target)
            ans.addAll(res)
        }

        return ans.map { it.sorted() }
            .distinct()
            .toList()
    }

    private fun calc(candidates: IntArray, target: Int): MutableList<MutableList<Int>> {
        val tmpAns = mutableListOf<MutableList<Int>>()

        for (i in 0 until candidates.size) {
            if (candidates[i] == target) {
                tmpAns.add(mutableListOf(candidates[i]))
            } else if (target - candidates[i] > 0) {
                val res = calc(candidates, target - candidates[i])

                res.forEach { it.add(candidates[i]) }

                tmpAns.addAll(res)
            } else {
                tmpAns.add(mutableListOf(-1))
            }
        }

        return tmpAns.filter { !it.contains(-1) }.toMutableList()
    }
}
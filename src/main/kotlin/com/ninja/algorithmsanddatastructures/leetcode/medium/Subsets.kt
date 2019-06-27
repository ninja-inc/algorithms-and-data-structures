package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/subsets/
 */
class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        backtrack(ans, mutableListOf(), nums, 0)

        return ans
    }

    private fun backtrack(ans: MutableList<MutableList<Int>>, tmpList: MutableList<Int>, nums: IntArray, start: Int) {
        ans.add(ArrayList(tmpList))
        for (i in start until nums.size) {
            tmpList.add(nums[i])
            backtrack(ans, tmpList, nums, i + 1)
            tmpList.removeAt(tmpList.size - 1)
        }
    }

    private fun backtrack2(ans: MutableList<MutableList<Int>>, tmpList: MutableList<Int>, nums: IntArray, start: Int) {
        ans.add(ArrayList(tmpList))

        for (i in start until nums.size) {
            val ttmpList = ArrayList(tmpList)
            ttmpList.add(nums[i])
            backtrack2(ans, ttmpList, nums, i + 1)
            //tmpList.removeAt(tmpList.size - 1)
        }
    }
}

class Foo {
    fun subsets(nums: IntArray): List<List<Int>> {
        val list = ArrayList<List<Int>>()
        backtrack(list, ArrayList(), nums, 0)
        return list
    }

    private fun backtrack(list: MutableList<List<Int>>, tempList: MutableList<Int>, nums: IntArray, start: Int) {
        list.add(ArrayList(tempList))
        for (i in start until nums.size) {
            tempList.add(nums[i])
            backtrack(list, tempList, nums, i + 1)
            tempList.removeAt(tempList.size - 1)
        }
    }
}

class Subsets2 {
    fun subsets(nums: IntArray): List<List<Int>> {
        val backAns = mutableListOf(mutableListOf<Int>())
        for (size in 0 .. nums.size)
            backAns.addAll(run(nums, 0, size))

        return backAns.distinct()
    }

    private fun run(nums: IntArray, start: Int, size: Int): MutableList<MutableList<Int>> {
        if (size == 0)
            return mutableListOf(mutableListOf(nums[start]))

        val backAns = mutableListOf(mutableListOf<Int>())
        for (s in start + 1 until nums.size)
            backAns.addAll(run(nums, s, size - 1))

        return backAns
            .map {
                it.add(nums[start])
                it
            }
            .toMutableList()
    }
}
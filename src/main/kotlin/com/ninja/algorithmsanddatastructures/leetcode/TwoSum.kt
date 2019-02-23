package com.ninja.algorithmsanddatastructures.leetcode

import java.util.concurrent.atomic.AtomicInteger

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class TwoSum {
    /**
     * O(n^2)
     */
    fun run(nums: List<Int>, target: Int): List<Int> {
        for (i in 0 until nums.size -1)
            for (j in i + 1 until nums.size)
                if (nums[i] + nums[j] == target)
                    return listOf(i, j)

        throw RuntimeException("answer not found")
    }

    /**
     * O(n)
     * it is actually 2n
     */
    fun run2(nums: List<Int>, target: Int): List<Int> {
        val atom = AtomicInteger()
        val table = nums.map { it to atom.getAndIncrement() }.toMap()

        for (num in nums)
            if (table[target - num] != null)
                return listOf(table[num]!!, table[target - num]!!)

        throw RuntimeException("answer not found")
    }

    /**
     * O(n)
     * it is actually n
     */
    fun run3(nums: List<Int>, target: Int): List<Int> {
        val table = mutableMapOf<Int, Int>()

        for (i in 0 until nums.size) {
            if (table[target - nums[i]] != null)
                return listOf(table[target - nums[i]]!!, i)

            table.put(nums[i], i)
        }

        throw RuntimeException("answer not found")
    }
}

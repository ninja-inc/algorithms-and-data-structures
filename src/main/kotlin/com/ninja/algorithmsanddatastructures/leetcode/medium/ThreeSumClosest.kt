package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/3sum-closest/
 */
class ThreeSumClosest {
    fun run(nums: List<Int>, target: Int): Int {
        val ans = mutableListOf<Int>()

        for (i in 0 until nums.size - 2)
            for (j in i + 1 until nums.size -1)
                for (k in j + 1 until nums.size)
                    ans.add(nums[i] + nums[j] + nums[k])

        var tmp = Int.MAX_VALUE
        var anss = 0
        for (a in ans) {
            if (tmp > target - a) {
                tmp = target - a
                anss = a
            }

        }

        return anss
    }

    fun run2(nums: List<Int>, target: Int): Int {
        val map = mutableMapOf<Int, Boolean>()
        for (num in nums)
            map[num] = true

        var ans = Int.MAX_VALUE

        for (i in 0 until nums.size - 1)
            for (j in i + 1 until nums.size) {
                var hope = target - nums[i] - nums[j]
                var tmp = 0

                while (map[hope + tmp] == false || map[hope - tmp] == false)
                    tmp ++

                if (ans > target - tmp)
                    ans = target - tmp
            }

        return ans + target
    }

    /**
     * https://leetcode.com/problems/3sum-closest/discuss/257553/python-O(n2)-and-O(n3)
     */
    fun run3(nums: List<Int>, target: Int): Int {
        var ans = mutableMapOf<Int, Int>()

        val sortedNums = nums.sorted()

        for (i in 0 until sortedNums.size) {
            var l = i + 1
            var r = sortedNums.size - 1

            while (l < r) {
                val tmp = sortedNums[i] + sortedNums[l] + sortedNums[r]
                ans[tmp] = target - tmp

                if (tmp == target) {
                    return tmp
                } else if (tmp < target) {
                    r --
                } else {
                    l ++
                }

            }
        }

        return ans.entries
                .minBy { Math.abs(it.value) }!! .key
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
class ContainerWithMostWater {
    fun run(heights: List<Int>): Int {
        var ans = 0

        for (i in 0 until heights.size - 1)
            for (j in i + 1 until heights.size)
                if (ans < Math.min(heights[i], heights[j]) * (j - i))
                    ans = Math.min(heights[i], heights[j]) * (j - i)

        return ans
    }

    fun twoPointerApproach(heights: List<Int>): Int {
        var ans = 0

        var l = 0
        var r = heights.size - 1
        while (l < r) {
            if (ans < Math.min(heights[l], heights[r]) * (r - l))
                ans = Math.min(heights[l], heights[r]) * (r - l)

            if (heights[l] < heights[r])
                l ++
            else
                r --
        }

        return ans
    }
}

package com.ninja.algorithmsanddatastructures.top10.searching_and_sorting

class BinarySearch {
    fun run(array: List<Int>, target: Int): Int? {

        var s: Int = 0
        var e: Int = array.size
        var ans: Int? = null

        while(true) {
            println("s: $s, e: $e")

            val half = (s + e) / 2

            if (s > e) {
                break
            } else if (target == array[half]) {
                ans = target
                break
            } else if (array[half] < target) {
                s = half + 1
            } else if (target < array[half]) {
                e = half - 1
            }
        }

        return ans
    }
}
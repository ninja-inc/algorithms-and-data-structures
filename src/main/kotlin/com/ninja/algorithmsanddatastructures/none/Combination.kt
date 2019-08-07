package com.ninja.algorithmsanddatastructures.none

fun main(nums: List<Int>) {
    combination(nums, mutableListOf())
}

private fun combination(nums: List<Int>, tmp: MutableList<Int>) {
    if (tmp.size == nums.size) {
        println(tmp)
        return
    }

    for (i in 0 until nums.size) {
        if (tmp.contains(nums[i]))
            continue
        tmp.add(nums[i])
        combination(nums, tmp)
        tmp.removeAt(tmp.size - 1)
    }
}

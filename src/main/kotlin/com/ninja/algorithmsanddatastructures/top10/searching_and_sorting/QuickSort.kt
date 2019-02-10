package com.ninja.algorithmsanddatastructures.top10.searching_and_sorting

/**
 * https://www.geeksforgeeks.org/quick-sort/
 *
 * partition algorithm below is more understandable than above.
 * https://ja.wikipedia.org/wiki/%E3%82%AF%E3%82%A4%E3%83%83%E3%82%AF%E3%82%BD%E3%83%BC%E3%83%88
 */
class QuickSort {
    fun run(array: Array<Int>, left: Int, right: Int) {
        if (left < right) {
            val pivot = left + (right - left) / 2

            var l = left
            var r = right

            while (true) {
                println("pivot: $pivot, l: $l, r: $r")

                while (array[l] < array[pivot]) {
                    l ++
                }
                while (array[pivot] < array[r])
                    r --

                if (l >= r)
                    break

                val swap = array[r]
                array[r] = array[l]
                array[l] = swap

                l ++
                r --
            }

            run(array, left, l - 1)
            run(array, r + 1, right)
        }
    }
}
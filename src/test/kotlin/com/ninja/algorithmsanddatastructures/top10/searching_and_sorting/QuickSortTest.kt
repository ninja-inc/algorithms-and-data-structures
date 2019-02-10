package com.ninja.algorithmsanddatastructures.top10.searching_and_sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QuickSortTest{
    val quickSort = QuickSort()

    @Test
    fun test1() {
        val array = arrayOf(8, 4, 3, 7, 6, 5, 2, 1)

        quickSort.run(array, 0, 7)

        assertThat(array).isEqualTo(arrayOf(1,2,3,4,5,6,7,8))
    }
}

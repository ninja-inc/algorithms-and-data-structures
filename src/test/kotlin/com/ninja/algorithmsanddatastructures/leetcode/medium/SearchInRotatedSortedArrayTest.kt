package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchInRotatedSortedArrayTest {
    private val searchInRotatedSortedArray = SearchInRotatedSortedArray()

    @Test
    fun test001() {
        assertThat(searchInRotatedSortedArray.search(intArrayOf(4,5,6,7,0,1,2), 0))
            .isEqualTo(4)
    }

    //@Test
    fun test002() {
        assertThat(searchInRotatedSortedArray.search(intArrayOf(1,3,5), 1))
            .isEqualTo(0)
    }

    @Test
    fun test003() {
        assertThat(searchInRotatedSortedArray.search(intArrayOf(5,1,3), 5))
            .isEqualTo(0)
    }

    @Test
    fun test01() {
        assertThat(searchInRotatedSortedArray.search2(intArrayOf(0,1,2,3,4,5,6,7,8,9), 4))
            .isEqualTo(4)
    }

    @Test
    fun test011() {
        assertThat(searchInRotatedSortedArray.search2(intArrayOf(0,1,2,3,4,5,6,7,8,9,10), 4))
            .isEqualTo(4)
    }

    @Test
    fun test02() {
        assertThat(searchInRotatedSortedArray.search2(intArrayOf(0,1,2,3,4,5,6,7,8,9), 5))
            .isEqualTo(5)
    }

    @Test
    fun test03() {
        assertThat(searchInRotatedSortedArray.search2(intArrayOf(0,1,2,3,4,5,6,7,8,9), 500))
            .isEqualTo(-1)
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.easy

import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MergeTwoSortedListsTest {
    val logic = MergeTwoSortedLists()

    @Test
    fun test01() {
        val n11 = ListNode(1)
        val n12 = ListNode(2)
        val n13 = ListNode(4)

        val n21 = ListNode(1)
        val n22 = ListNode(3)
        val n23 = ListNode(4)

        n11.linkNext(n12)
        n12.linkNext(n13)

        n21.linkNext(n22)
        n22.linkNext(n23)

        var tmp = logic.run(n11, n21)

        var ans = ""

        while (true) {
            ans += tmp.value.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        Assertions.assertThat(ans).isEqualTo("112344")
    }
}
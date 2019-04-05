package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SwapNodesInPairsTest {
    val logic = SwapNodesInPairs()

    @Test
    fun test01() {
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        val n4 = ListNode(4)

        n1.linkNext(n2)
        n2.linkNext(n3)
        n3.linkNext(n4)

        var tmp = logic.run(n1)
        var ans = ""
        while (true) {
            ans += tmp.value.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        Assertions.assertThat(ans).isEqualTo("2143")
    }
}
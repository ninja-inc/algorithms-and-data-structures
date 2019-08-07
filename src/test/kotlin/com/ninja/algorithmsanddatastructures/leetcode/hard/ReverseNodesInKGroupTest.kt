package com.ninja.algorithmsanddatastructures.leetcode.hard

import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReverseNodesInKGroupTest {
    val logic = ReverseNodesInKGroup()

    @Test
    fun test01() {
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        val n4 = ListNode(4)
        val n5 = ListNode(5)

        n1.linkNext(n2)
        n2.linkNext(n3)
        n3.linkNext(n4)
        n4.linkNext(n5)

        var tmp = logic.run(n1, 2)

        var ans = ""

        while (true) {
            ans += tmp.`val`.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        assertThat(ans).isEqualTo("21435")
    }

    @Test
    fun test02() {
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        val n4 = ListNode(4)
        val n5 = ListNode(5)

        n1.linkNext(n2)
        n2.linkNext(n3)
        n3.linkNext(n4)
        n4.linkNext(n5)

        var tmp = logic.run(n1, 3)

        var ans = ""

        while (true) {
            ans += tmp.`val`.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        assertThat(ans).isEqualTo("32145")
    }
}
package com.ninja.algorithmsanddatastructures.leetcode.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemoveNthNodeFromEndOfListTest {
    private val logic = RemoveNthNodeFromEndOfList()

    @Test
    fun test01() {
        var ans = ""
        var tmp = logic.run(makeNode(), 2)
        while (true) {
            ans += tmp.`val`.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        assertThat(ans).isEqualTo("1235")
    }

    @Test
    fun test02() {
        var ans = ""
        var tmp = logic.twoPointers(makeNode(), 2)
        while (true) {
            ans += tmp.`val`.toString()
            if (tmp.next == null)
                break

            else {
                tmp = tmp.next!!
            }
        }

        assertThat(ans).isEqualTo("1235")
    }

    private fun makeNode(): ListNode {
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        val n4 = ListNode(4)
        val n5 = ListNode(5)

        n1.linkNext(n2)
        n2.linkNext(n3)
        n3.linkNext(n4)
        n4.linkNext(n5)

        return n1
    }
}
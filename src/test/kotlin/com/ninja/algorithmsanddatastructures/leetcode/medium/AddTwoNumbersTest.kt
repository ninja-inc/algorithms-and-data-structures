package com.ninja.algorithmsanddatastructures.leetcode.medium

import com.ninja.algorithmsanddatastructures.leetcode.medium.AddTwoNumbers
import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class AddTwoNumbersTest {
    private val addTwoNumbers = AddTwoNumbers()

    @Test
    fun test() {
        val node2 = ListNode(2)
        val node4 = ListNode(4)
        val node3 = ListNode(3)

        val node5 = ListNode(5)
        val node6 = ListNode(6)
        //val node4 = ListNode(4)

        node2.linkNext(node4)
        node4.linkNext(node3)

        node5.linkNext(node6)
        node6.linkNext(node4)


        val result = addTwoNumbers.run2(node2, node5)

        assertAll(
                { assertThat(result.value).isEqualTo(7) },
                { assertThat(result.next!!.value).isEqualTo(0) },
                { assertThat(result.next!!.next!!.value).isEqualTo(8) },
                { assertThat(result.next!!.next!!.next).isNull() }
        )
    }
}

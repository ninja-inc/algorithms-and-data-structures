package com.ninja.algorithmsanddatastructures.leetcode.medium

import java.util.*

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
class RemoveNthNodeFromEndOfList {
    fun run(head: ListNode, n: Int): ListNode {
        var queue: Deque<ListNode> = LinkedList()

        var ans = ListNode(head.value)
        var ansTmp = ans
        var tmp: ListNode = head.next!!

        while (true) {
            if (tmp.next == null) {
                queue.addFirst(tmp)

                break

            } else {
                queue.addFirst(tmp)
                tmp = tmp.next!!

                if (queue.size == n) {
                    ansTmp.next = ListNode(queue.pollLast().value)
                    ansTmp = ansTmp.next!!
                }
            }
        }

        for (i in 0 until queue.size) {
            if (i == 0) {
                queue.pollLast()
            } else {
                ansTmp.next = ListNode(queue.pollLast().value)
                ansTmp = ansTmp.next!!
            }
        }

        return ans
    }

    fun twoPointers(head: ListNode, n: Int): ListNode {
        val dummy = ListNode(-1)
        dummy.next = head

        var first: ListNode? = dummy
        var second: ListNode? = dummy

        for (i in 0 .. n)
            first = first!!.next!!

        while (first != null) {
            first = first.next
            second = second!!.next
        }

        second!!.next = second!!.next!!.next

        return dummy.next!!
    }
}

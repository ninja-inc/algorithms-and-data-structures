package com.ninja.algorithmsanddatastructures.leetcode.hard

import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
class MergeKSortedLists {
    fun run(lists: List<ListNode>): ListNode {
        var head = ListNode(-1)
        val dummy = head

        val nodes: MutableList<ListNode?> = lists.toMutableList()

        while (true) {
            val minNode = nodes
                    .filter { it != null }
                    .minBy { it!!.`val` }

            val minIndex = nodes.indexOf(minNode)

            if (minNode != null) {
                head.next = minNode
                head = head.next!!

                nodes[minIndex] = nodes[minIndex]!!.next
            }

            if (nodes.none { it != null })
                break
        }

        return dummy.next!!
    }
}

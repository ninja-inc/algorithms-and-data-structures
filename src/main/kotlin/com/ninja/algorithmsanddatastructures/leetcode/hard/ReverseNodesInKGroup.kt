package com.ninja.algorithmsanddatastructures.leetcode.hard

import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode
import java.util.*

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 *
 * This answer does not satisfy conditions related to memory usage.
 */
class ReverseNodesInKGroup {
    fun run(head: ListNode, k: Int): ListNode {
        val ansHead = ListNode(-1)
        var ans = ansHead
        var h: ListNode? = head

        var list = ArrayDeque<ListNode>()

        while(true) {
            var i = 0
            while (h!=null && i<k) {
                list.addFirst(h)
                h = h.next
                i ++
            }
            if (k == list.size) {
                while (list.size > 0) {
                    ans.linkNext(list.pollFirst())
                    ans = ans.next!!
                }
            } else {
                while (list.size > 0) {
                    ans.linkNext(list.pollLast())
                    ans = ans.next!!
                }
                break
            }
        }

        return ansHead.next!!
    }
}
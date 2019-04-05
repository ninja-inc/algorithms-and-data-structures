package com.ninja.algorithmsanddatastructures.leetcode.medium

class SwapNodesInPairs {
    fun run(head: ListNode): ListNode {
        val dummy = ListNode(-1)
        var ans = dummy
        var tmp: ListNode? = head

        var swap: ListNode? = null
        while (tmp != null) {
            if (swap == null) {
                swap = ListNode(tmp.value)
            } else {
                ans.next = ListNode(tmp.value)
                ans = ans.next!!

                ans.next = ListNode(swap.value)
                ans = ans.next!!

                swap = null
            }
            tmp = tmp.next
        }

        if (swap != null) {
            ans.next = ListNode(swap.value)
        }

        return dummy.next!!
    }
}
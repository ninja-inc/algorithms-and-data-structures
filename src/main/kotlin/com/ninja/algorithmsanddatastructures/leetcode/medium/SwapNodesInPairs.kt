package com.ninja.algorithmsanddatastructures.leetcode.medium

class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        var hhead = head
        var ans = ListNode(-1)
        val aans = ans

        var prev: ListNode? = null
        while (true) {
            if (hhead == null)
                break

            if (prev != null) {
                prev = hhead
                hhead = hhead.next

                ans.next = hhead
                ans = ans.next!!
                ans.next = prev
                prev = null
            } else {
                prev = hhead
                hhead = hhead.next
            }
        }

        return aans.next
    }




    fun run(head: ListNode): ListNode {
        val dummy = ListNode(-1)
        var ans = dummy
        var tmp: ListNode? = head

        var swap: ListNode? = null
        while (tmp != null) {
            if (swap == null) {
                swap = ListNode(tmp.`val`)
            } else {
                ans.next = ListNode(tmp.`val`)
                ans = ans.next!!

                ans.next = ListNode(swap.`val`)
                ans = ans.next!!

                swap = null
            }
            tmp = tmp.next
        }

        if (swap != null) {
            ans.next = ListNode(swap.`val`)
        }

        return dummy.next!!
    }
}
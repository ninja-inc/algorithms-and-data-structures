package com.ninja.algorithmsanddatastructures.leetcode.easy

import com.ninja.algorithmsanddatastructures.leetcode.medium.ListNode

class MergeTwoSortedLists {
    fun run(n1: ListNode, n2: ListNode): ListNode {
        var nn1: ListNode? = n1
        var nn2: ListNode? = n2

        val head = ListNode(-1)
        var dummy = head

        while (!(nn1 == null && nn2 == null)) {
            if (nn1 == null && nn2 != null) {
                dummy.linkNext(nn2)
                break
            }
            else if (nn2 == null && nn1 != null) {
                dummy.linkNext(nn1)
                break
            }

            if (nn1!!.`val` < nn2!!.`val`) {
                dummy.linkNext(nn1)
                nn1 = nn1.next
                if (dummy.next != null)
                    dummy = dummy.next!!

            } else {
                dummy.linkNext(nn2)
                nn2 = nn2.next
                if (dummy.next != null)
                    dummy = dummy.next!!
            }

        }

        return head.next!!
    }
}
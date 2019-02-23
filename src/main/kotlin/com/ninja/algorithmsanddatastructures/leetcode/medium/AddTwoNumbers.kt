package com.ninja.algorithmsanddatastructures.leetcode.medium

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class AddTwoNumbers {
    var isUp = false

    fun run(l1: ListNode, l2: ListNode): ListNode {
        var tmp = l1.value + l2.value

        if (isUp) {
            tmp += 1
        }

        if (tmp > 9) {
            isUp = true
            tmp -= 10
        } else {
            isUp = false
        }

        if (l1.next != null) {
            return ListNode(tmp).also { it.next = this.run(l1.next!!, l2.next!!) }
        } else
            return ListNode(tmp)
    }

    // without recursion
    fun run2(l1: ListNode, l2: ListNode): ListNode {
        var ans = ListNode(0)
        var tmpAns = ans

        var tmp1 = l1
        var tmp2 = l2

        while (true) {
            var tmp = tmp1.value + tmp2.value

            if (isUp) {
                tmp += 1
            }

            if (tmp > 9) {
                isUp = true
                tmp -= 10
            } else {
                isUp = false
            }

            tmpAns.next = ListNode(tmp)
            tmpAns = tmpAns.next!!

            if (tmp1.next == null) {
                break
            } else {
                tmp1 = tmp1.next!!
                tmp2 = tmp2.next!!
            }
        }

        return ans.next!!
    }
}

class ListNode {
    val value: Int
    var next: ListNode? = null

    constructor(value: Int) {
        this.value = value
    }

    fun linkNext(next: ListNode) {
        this.next = next
    }
}

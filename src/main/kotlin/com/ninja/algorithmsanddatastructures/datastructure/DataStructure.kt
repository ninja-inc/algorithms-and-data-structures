package com.ninja.algorithmsanddatastructures.datastructure

import java.util.*

class DataStructure {
    fun array() {
        val array = Array(10) { it * 2 }

    }

    fun arrayList() {
        val arrayList = arrayListOf(1, 2, 3)
        arrayList.add(5)

        arrayList.sort()
    }

    fun linkedList() {
        val linkedList = LinkedList<Int>()

        linkedList.push(1)
        linkedList.poll()
        linkedList.pop()


        linkedList.addFirst(1)
        linkedList.addLast(2)
        linkedList.pollFirst()
        linkedList.pollLast()
    }

    fun hashMap() {
        val hashMap = hashMapOf("a" to 1)

        hashMap["a"]
    }

    fun set() {
        val set = mutableSetOf("a", "b")

        set.add("")
        set.remove("")
        set.contains("")
    }
}
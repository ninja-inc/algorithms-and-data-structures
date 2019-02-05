package com.ninja.algorithmsanddatastructures.top10.graph_algorithms

import org.junit.jupiter.api.Test

class DepthFirstSearchTest {
    private val myDepthFirstSearch = MyDepthFirstSearch()

    @Test
    fun test() {
        val node2 = Node(id = 2)
        val node0 = Node(id = 0)
        val node1 = Node(id = 1)
        val node3 = Node(id = 3)

        node2.links = listOf(node0, node3)
        node0.links = listOf(node1, node2)
        node1.links = listOf(node2)
        node3.links = listOf(node3)

        myDepthFirstSearch.traversal2(node2)
    }
}

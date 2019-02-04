package com.ninja.algorithmsanddatastructures.top10.graph_algorithms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class MyBreadthFirstSearchTest {
    private val myBreadthFirstSearch = MyBreadthFirstSearch()

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

        myBreadthFirstSearch.traversal(node2)

        assertAll(
                { assertThat(node0.visited).isTrue() },
                { assertThat(node1.visited).isTrue() },
                { assertThat(node2.visited).isTrue() },
                { assertThat(node3.visited).isTrue() }
        )
    }
}

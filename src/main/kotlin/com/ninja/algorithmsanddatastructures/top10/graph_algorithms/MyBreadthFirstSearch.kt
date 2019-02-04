package com.ninja.algorithmsanddatastructures.top10.graph_algorithms

class MyBreadthFirstSearch {
    fun traversal(node: Node) {
        if (!node.visited) {
            node.visited = true
            for (adjacent in node.links) {
                traversal(adjacent)
            }
        }
    }
}

class Node(
        var visited: Boolean = false,
        val id: Int,
        var links: List<Node> = listOf()
)
package com.ninja.algorithmsanddatastructures.top10.graph_algorithms

import java.util.*
import java.util.LinkedList



/**
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */
class MyBreadthFirstSearch {
    fun traversal(node: Node) {
        if (!node.visited) {
            node.visited = true
            for (adjacent in node.links) {
                traversal(adjacent)
            }
        }
    }

    // improvement after reading a solution
    fun traversal2(node: Node) {
        val queue = LinkedList<Node>()

        node.visited = true
        queue.add(node)
        while (queue.size != 0) {
            val tmpNode = queue.poll()

            print("${tmpNode.id} ")

            tmpNode.links
                    .forEach { adj ->
                        if (!adj.visited) {
                            adj.visited = true
                            queue.add(adj)
                        }
                    }
        }
    }

    // improve again
    fun traversal3(node: Node) {
        val queue = LinkedList<Node>()
        queue.add(node)

        while (queue.size != 0) {
            val tmpNode = queue.poll()

            if (!tmpNode.visited) {
                tmpNode.visited = true
                print("${tmpNode.id} ")

                tmpNode.links
                        .forEach { adj -> queue.add(adj)}
            }
        }
    }
}

class Node(
        var visited: Boolean = false,
        val id: Int,
        var links: List<Node> = listOf()
)

class BreadthFirstSearch {
    fun run() {
        val graph = Graph(4)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        traversal(2, graph)
    }

    fun traversal(start: Int, graph: Graph) {
        val visited = arrayOfNulls<Boolean>(graph.size)
        for (i in 0 until graph.size)
            visited[i] = false

        val queue = LinkedList<Int>()

        visited[start] = true
        queue.add(start)

        var tmp: Int
        while (queue.size != 0) {
            tmp = queue.poll()
            print("$tmp ")

            val iterator = graph.adj[tmp]!!.listIterator()
            while (iterator.hasNext()) {
                val n = iterator.next()

                if (!visited[n]!!) {
                    visited[n] = true
                    queue.add(n)
                }
            }
        }
    }
}

class Graph {
    val size: Int
    val adj: Array<LinkedList<Int>?>

    constructor(size: Int) {
        this.size = size

        adj = arrayOfNulls(size)
        for (i in 0 until size)
            adj[i] = LinkedList()
    }

    fun addEdge(v: Int, w: Int) {
        adj[v]!!.add(w)
    }
}

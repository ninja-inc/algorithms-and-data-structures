package com.ninja.algorithmsanddatastructures.top10.graph_algorithms

import java.util.*

class MyDepthFirstSearch {
    fun traversal(node: Node) {
        val queue = ArrayDeque<Node>()
        queue.push(node)

        while (queue.size != 0) {
            val tmpNode = queue.pop()

            if (!tmpNode.visited) {
                tmpNode.visited = true
                print("${tmpNode.id} ")

                tmpNode.links
                        .forEach { adj -> queue.add(adj)}
            }
        }
    }


    fun traversal2(node: Node) {
        if (!node.visited) {
            node.visited = true
            print("${node.id} ")

            node.links.forEach { adj -> traversal2(adj) }
        }
    }
}
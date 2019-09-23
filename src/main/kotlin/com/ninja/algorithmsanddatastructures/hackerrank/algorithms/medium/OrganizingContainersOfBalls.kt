package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.lang.RuntimeException
import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the organizingContainers function below.
fun organizingContainers(container: Array<Array<Int>>): String {
    val impossible = "Impossible"
    val possible = "Possible"

    val n = container.size

    val a: Array<Int> = Array(n) { 0 }
    val b: Array<Int> = Array(n) { 0 }

    for (i in 0 until n) {
        for (j in 0 until n) {
            a[i] += container[i][j]
            b[j] += container[i][j]
        }
    }

    for (i in 0 until n) {
        var isBreak = false
        for (j in i until n) {
            if (a[i] == b[j]) {
                val tmp = b[j]
                b[j] = b[i]
                b[i] = tmp
                isBreak = true
                break
            }
        }
        if (!isBreak)
            return impossible
    }

    return possible
}

fun organizingContainers2(container: Array<Array<Int>>): String {
    val impossible = "Impossible"
    val possible = "Possible"

    for (i in container.indices) {
        val row = i
        val col = i

        for (r in row + 1 until container.size) {
            if (container[r][col] != 0) {
                try {
                    swap(row, r, col, container)
                } catch (e: RuntimeException) {
                    return impossible
                }
            }
        }

        val cnt = container[row].filter { it != 0 }.count()
        if (cnt != 1)
            return impossible
    }

    return possible
}

fun swap(r1: Int, r2: Int, col: Int, container: Array<Array<Int>>) {
    for (c in col+1 until container.size) {
        while (container[r2][col] > 0 && container[r1][c] > 0) {
            // down to top
            container[r2][col] -= 1
            container[r1][col] += 1

            // top to down
            container[r1][c] -= 1
            container[r2][c] +=1
        }
    }

    if (container[r2][col] > 0)
        throw RuntimeException("BAD!")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toInt()

        val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

        for (i in 0 until n) {
            container[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)

        println(result)
    }
}

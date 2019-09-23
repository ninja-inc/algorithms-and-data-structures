package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

val MAGIC_SQUARES = listOf(
    listOf(listOf(8, 1, 6), listOf(3, 5, 7), listOf(4, 9, 2)),
    listOf(listOf(6, 1, 8), listOf(7, 5, 3), listOf(2, 9, 4)),
    listOf(listOf(4, 9, 2), listOf(3, 5, 7), listOf(8, 1, 6)),
    listOf(listOf(2, 9, 4), listOf(7, 5, 3), listOf(6, 1, 8)),
    listOf(listOf(8, 3, 4), listOf(1, 5, 9), listOf(6, 7, 2)),
    listOf(listOf(4, 3, 8), listOf(9, 5, 1), listOf(2, 7, 6)),
    listOf(listOf(6, 7, 2), listOf(1, 5, 9), listOf(8, 3, 4)),
    listOf(listOf(2, 7, 6), listOf(9, 5, 1), listOf(4, 3, 8))
)

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var ans = Int.MAX_VALUE

    for (m in MAGIC_SQUARES) {
        var tmp = 0
        for (i in 0 until 3) {
            if (m[i] != s[i]) {
                tmp += Math.abs(s[i][0]-m[i][0]) + Math.abs(s[i][1]-m[i][1]) + Math.abs(s[i][2]-m[i][2])
            }
        }
        ans = Math.min(ans, tmp)
    }

    return ans
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
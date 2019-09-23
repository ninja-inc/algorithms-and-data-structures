package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.easy

import java.lang.Math.abs
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var rtol = 0
    var y = 0
    for (x in 0 until arr.size) {
        rtol += arr[y++][x]
    }

    y = 0
    var ltor = 0
    for (x in arr.size - 1 downTo 0) {
        ltor += arr[y++][x]
    }

    return abs(rtol - ltor)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

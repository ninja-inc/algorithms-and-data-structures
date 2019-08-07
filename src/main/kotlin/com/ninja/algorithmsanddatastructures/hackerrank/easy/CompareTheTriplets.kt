package com.ninja.algorithmsanddatastructures.hackerrank.easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aScore = 0
    var bScore = 0

    for (i in 0 until a.size) {
        if (a[i] < b[i])
            bScore++
        else if (a[i] > b[i])
            aScore++
    }

    return arrayOf(aScore, bScore)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

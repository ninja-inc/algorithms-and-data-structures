package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.math.*
import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): Unit {
    var ans: BigInteger = BigInteger.ONE

    for (i in 1 .. n)
        ans *= i.toBigInteger()

    println(ans)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}

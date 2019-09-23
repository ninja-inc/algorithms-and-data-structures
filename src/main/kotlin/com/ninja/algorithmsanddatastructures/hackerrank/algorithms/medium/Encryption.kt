package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the encryption function below.
fun encryption(s: String): String {
    val string = s.replace(" ", "")
    val num = Math.sqrt(string.length.toDouble())
    //val row = Math.floor(num).toInt()
    val column = Math.ceil(num).toInt()

    val ans = Array<MutableList<Char>>(column) { mutableListOf() }

    for (i in string.indices) {
        ans[i%column].add(string[i])
    }

    return ans.joinToString(separator = " ") { it.joinToString(separator = "") }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}

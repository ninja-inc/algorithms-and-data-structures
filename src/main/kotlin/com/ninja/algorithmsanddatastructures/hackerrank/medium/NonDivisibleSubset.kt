package com.ninja.algorithmsanddatastructures.hackerrank.medium

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */


fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    val counts = Array(k) { 0 }

    for (number in s)
        counts[number % k] += 1

    // special case for zero
    var count = Math.min(counts[0], 1)

    for (i in 1 until (k/2)+1) {
        if (i != k -i)
            count += Math.max(counts[i], counts[k-i])
    }

    if (k%2 == 0)
        count++

    return count
}

fun nonDivisibleSubset2(k: Int, s: Array<Int>): Int {
    val set = mutableSetOf<Pair<Int, Int>>()

    for (i in 0 until s.size) {
        for (j in i+1 until s.size) {
            if ((s[i]+s[j])%k == 0) {
                set.add(makePair(s[i], s[j]))
            }
        }
    }

    //println(set)

    val blacklist = mutableSetOf<Int>()
    for (s1 in set) {
        var first = 0
        var second = 0

        for (s2 in set) {
            if (s2.first == s1.first || s2.second == s1.first)
                first++
            if (s2.first == s1.second || s2.second == s1.second)
                second++
        }

        if (first > second)
            blacklist.add(s1.first)
        else
            blacklist.add(s1.second)
    }

    return s.size - blacklist.size
}

private fun makePair(a: Int, b: Int) = if (a > b) Pair(a,b) else Pair(b,a)

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}

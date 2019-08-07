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

// Complete the climbingLeaderboard function below.
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    var rank = 1
    var s = 0

    val ans = mutableListOf<Int>()

    var prev: Int? = null

    for (a in alice.size - 1 downTo 0) {
        while (s < scores.size) {
            if (alice[a] >= scores[s]) {
                ans.add(rank)
                break
            }

            if (prev != scores[s])
                rank++

            prev = scores[s]
            s++
        }

        if (s == scores.size) {
            ans.add(rank)
        }
    }

    return ans.reversed().toTypedArray()
}

fun find(list: Array<Int>, target: Int): Int {
    var pivot = list.size / 2

    var l = 0
    var r = list.size - 1
    loop@
    while (true) {
        when {
            list[pivot] == target ->
                break@loop

            list[pivot] < target ->
                r = pivot - 1

            else ->
                l = pivot
        }

        if (r - l == 1) {
            if (list[r] > target) {
                return r + 1
            } else {
                return l
            }
        } else {
            pivot = (r + l) / 2
        }
    }

    return pivot
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}

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

/**
- n: an integer, the number of rows and columns in the board
- k: an integer, the number of obstacles on the board
- r_q: integer, the row number of the queen's position
- c_q: integer, the column number of the queen's position
- obstacles: a two dimensional array of integers where each element is an array of  integers, the row and column of an obstacle
 */
// Complete the queensAttack function below.
fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    var ans = 0

    var top = n
    var down = 1

    var left = 1
    var right = n

    var left_down = if (r_q >= c_q) 1 else c_q - r_q
    var right_top = (n - r_q) + c_q

    var left_top = c_q - (n - r_q)
    var right_down = if (r_q >= c_q) n else c_q - r_q
    for (obstacle in obstacles) {
        // vertical
        if (c_q == obstacle[1]) {
            if (r_q < obstacle[0])
                top = Math.min(top, obstacle[0] - 1)
            else
                down = Math.max(down, obstacle[0] + 1)
        }
        // horizontal
        else if (r_q == obstacle[0]) {
            if (c_q < obstacle[1])
                right = Math.min(right, obstacle[1] - 1)
            else
                left = Math.max(left, obstacle[1] + 1)
        }
        // left-down to right-top
        else if (((c_q - obstacle[1])/(r_q - obstacle[0])) == 1) {
            if (c_q < obstacle[1])
                right_top = Math.min(right_top, obstacle[1] - 1)
            else
                left_down = Math.max(left_down, obstacle[1] + 1)
        }
        // left-top to right-down
        else if (((c_q - obstacle[1])/(r_q - obstacle[0])) == -1) {
            if (c_q < obstacle[1])
                right_down = Math.max(right_down, obstacle[1] - 1)
            else
                left_top = Math.min(left_top, obstacle[1] + 1)
        }
    }
    ans += (top - down) + (right - left) + (right_top - left_down) + (right_down - left_top)


    return ans
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val r_qC_q = scan.nextLine().split(" ")

    val r_q = r_qC_q[0].trim().toInt()

    val c_q = r_qC_q[1].trim().toInt()

    val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

    for (i in 0 until k) {
        obstacles[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}

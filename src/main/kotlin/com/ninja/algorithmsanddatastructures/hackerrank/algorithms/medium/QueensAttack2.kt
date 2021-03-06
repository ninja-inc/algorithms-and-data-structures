package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
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

    var left_down = if (r_q >= c_q) 1 else c_q - r_q + 1
    var right_top = if (r_q >= c_q) (n - r_q) + c_q else n

    var left_top = 0
    for (i in 0 until n) {
        if (c_q - i <= 1) {
            left_top = 1
            break
        }
        else if (r_q + i >= n) {
            left_top = c_q - i
            break
        }
    }

    var right_down = 0
    for (i in 0 until n) {
        if (c_q - i <= 1) {
            right_down = r_q + i
            break
        }
        else if (r_q + i >= n) {
            right_down = n
            break
        }
    }

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
                right_down = Math.min(right_down, obstacle[1] - 1)
            else
                left_top = Math.max(left_top, obstacle[1] + 1)
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

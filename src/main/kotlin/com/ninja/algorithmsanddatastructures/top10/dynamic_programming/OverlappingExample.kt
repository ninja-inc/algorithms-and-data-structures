package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

import java.util.stream.Stream



/**
 * https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
 * Same computing should be avoided.
 */
class OverlappingExample {
    /**
     * simple way, it can produce stack over flow
     */
    fun fibonacciRecursive(n: Int): Int =
            if (n <=1) {
                n
            } else {
                fibonacciRecursive(n-1) + fibonacciRecursive(n-2)
            }


    /**
     * memo will prevent same computing.
     * this is top down structure.
     */
    private var memo = mutableMapOf<Int, Int>()

    fun fibonacciMemoization(n: Int): Int {
        if (memo[n] == null) {
            if (n <=1) {
                memo[n] = n
            } else {
                memo[n] = fibonacciRecursive(n-1) + fibonacciRecursive(n-2)
            }
        }

        return memo[n]!!
    }

    /**
     * memo will prevent same computing.
     * this is bottom up structure.
     */
    fun fibonacciTabulation(n: Int): Int {
        val tab = mutableMapOf<Int, Int>()

        tab[0] = 0
        tab[1] = 1
        for (i in 2..n)
            tab[i] = tab[i-1]!! + tab[i-2]!!

        return tab[n]!!
    }


    /**
     * No recursive
     */
    private val tailCallImpl = TailCallImpl()

    fun fibonacciTailCall(n: Int): Int = tailCall(n, 1, 0).call()

    private fun tailCall(n1: Int, n2: Int, n3: Int): TailCall =
            when {
                n1 <= 0 -> tailCallImpl.complete(0)
                n1 == 1 -> tailCallImpl.complete(n2)
                else -> tailCallImpl.nextCall(tailCall(n1 - 1, n2 + n3, n2))
            }
}

@FunctionalInterface
interface TailCall {

    fun apply(): TailCall

    val isComplete: Boolean
        get() = false

    val result: Int
        get() = throw RuntimeException("Not implemented.")

    fun call(): Int = Stream.iterate(this, TailCall::apply)
            .filter(TailCall::isComplete)
            .findFirst()
            .orElseThrow { RuntimeException("Unreachable") }
            .result
}

class TailCallImpl {
    fun nextCall(function: TailCall): TailCall = function

    fun complete(value: Int): TailCall {
        return object : TailCall {

            override fun apply(): TailCall {
                throw RuntimeException("Not implemented.")
            }

            override val isComplete: Boolean
                get() = true

            override val result: Int
                get() = value
        }
    }
}
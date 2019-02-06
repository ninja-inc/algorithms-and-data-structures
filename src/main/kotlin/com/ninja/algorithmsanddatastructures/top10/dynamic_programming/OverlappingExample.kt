package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

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
        var tab = mutableMapOf<Int, Int>()

        tab[0] = 0
        tab[1] = 1
        for (i in 2..n)
            tab[i] = tab[i-1]!! + tab[i-2]!!

        return tab[n]!!
    }
}

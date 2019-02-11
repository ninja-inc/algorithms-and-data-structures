package com.ninja.algorithmsanddatastructures.top10.number_theory_and_other_mathematical

/**
 * https://www.geeksforgeeks.org/primality-test-set-1-introduction-and-school-method/
 *
 * Hmm, it focuses on mathematics much
 */
class PrimeNumber {
    fun test01(n: Int): Boolean {
        if (n <= 1)
            return false
        if (n == 2)
            return true

        for (i in 2 until n)
            if (n % i == 0)
                return false

        return true
    }
}

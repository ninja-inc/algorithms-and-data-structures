package com.ninja.algorithmsanddatastructures.hackerrank.algorithms.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the biggerIsGreater function below.
fun biggerIsGreater2(w: String): String {
    ans = null
    found = false
    val chars: List<Char> = w.toCharArray().toList().sorted()

    traversal(mutableListOf(), chars, mutableListOf(), w)


    ans = if (ans != null && ans != w) {
        ans
    } else {
        "no answer"
    }

    return ans!!
}

var ans: String? = null
var found = false
fun traversal(usedIndices: MutableList<Int>, chars: List<Char>, tmp: MutableList<Char>, word: String) {
    if (ans != null)
        return

    if (tmp.size == chars.size) {
        if (found) {
            ans = tmp.joinToString(separator = "")
        }

        if (!found) {
            found = tmp.size == chars.size && tmp.joinToString(separator = "") == word
        }
    } else {
        for (i in chars.indices) {
            if (usedIndices.contains(i))
                continue

            usedIndices.add(i)

            tmp.add(chars[i])
            traversal(usedIndices, chars, tmp, word)
            tmp.removeAt(tmp.size - 1)
            usedIndices.removeAt(usedIndices.size - 1)
        }
    }
}

// https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
fun biggerIsGreater(w: String): String {
    val array = w.toCharArray()

    // Find longest non-increasing suffix
    var i = array.size - 1
    while (i > 0 && array[i - 1] >= array[i])
        i --
    // Now i is the head index of the suffix

    if (i <= 0)
        return "no answer"

    // Let array[i - 1] be the pivot
    // Find rightmost element that exceeds the pivot
    var j = array.size - 1
    while (array[j] <= array[i - 1])
        j--
    // Now the value array[j] will become the new pivot
    // Assertion: j >= i

    // Swap the pivot with j
    var temp = array[i - 1]
    array[i - 1] = array[j]
    array[j] = temp

    // Reverse the suffix
    j = array.size - 1;
    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }

    return array.joinToString(separator = "")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val T = scan.nextLine().trim().toInt()

    for (TItr in 1..T) {
        val w = scan.nextLine()

        val result = biggerIsGreater(w)

        println(result)
    }
}

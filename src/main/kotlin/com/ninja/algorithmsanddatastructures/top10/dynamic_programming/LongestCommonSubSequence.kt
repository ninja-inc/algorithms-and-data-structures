package com.ninja.algorithmsanddatastructures.top10.dynamic_programming

/**
 * https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 */
class LongestCommonSubSequence {
    fun run(s1: String, s2: String): String {
        val tmp = arrayOfNulls<Seq>(s1.length)

        for (i in 0 until s1.length)
            tmp[i] = Seq(s1[i], 1)

        for (i in 1 until s1.length)
            for (j in 0 until i)
                if (Regex(".*${s1[j]}.*${s1[i]}.*").containsMatchIn(s2)
                        && tmp[i]!!.len < tmp[j]!!.len + 1) {
                    tmp[i]!!.len += 1
                    tmp[i]!!.froms = tmp[j]!!.froms.plus(tmp[j]!!.s)
                }

        tmp.forEach { seq -> println(seq) }

        return tmp.sortedBy { seq -> seq!!.len }
                .last()
                .let { it!!.froms.joinToString(separator = "") + it.s }
    }
}

data class Seq (
        val s: Char,
        var len: Int,
        var froms: List<Char> = mutableListOf()
)
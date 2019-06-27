package com.ninja.algorithmsanddatastructures.leetcode.easy

/**
 * https://leetcode.com/problems/count-and-say/
 */
class CountAndSay {
    fun countAndSay(n: Int): String {
        if (n == 1)
            return "1"

        var cas = "1"

        for (cnt in 1 until n) {
            var newCas = StringBuilder()
            var tmp: Char? = null
            var tmpCnt = 0
            for (i in 0 until cas.length) {
                if (tmp == null) {
                    tmp = cas[i]
                    tmpCnt = 1

                } else if (tmp == cas[i]) {
                    tmpCnt++

                } else {
                    newCas.append(tmpCnt.toString() + tmp)
                    tmp = cas[i]
                    tmpCnt = 1
                }
            }

            if (tmp != null)
                newCas.append(tmpCnt.toString() + tmp)

            cas = newCas.toString()
        }

        return cas
    }
}
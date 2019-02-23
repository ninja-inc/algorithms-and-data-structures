package com.ninja.algorithmsanddatastructures.leetcode.medium

import com.ninja.algorithmsanddatastructures.leetcode.medium.LongestSubstringWithoutRepeatingCharacters
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {
    private val ls = LongestSubstringWithoutRepeatingCharacters()

    @Test
    fun test1() {
        assertThat(ls.run("abcabcbb")).isEqualTo("abc")
    }

    @Test
    fun test2() {
        assertThat(ls.run("bbbbb")).isEqualTo("b")
    }

    @Test
    fun test3() {
        // wke is also answer
        assertThat(ls.run("pwwkew")).isEqualTo("kew")
    }


    @Test
    fun test4() {
        assertThat(ls.slidingWindow("abcabcbb")).isEqualTo(3)
    }

    @Test
    fun test5() {
        assertThat(ls.slidingWindow("bbbbb")).isEqualTo(1)
    }

    @Test
    fun test6() {
        // wke is also answer
        assertThat(ls.slidingWindow("pwwkew")).isEqualTo(3)
    }
}

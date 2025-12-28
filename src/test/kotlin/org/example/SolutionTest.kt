package org.example

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun maxSlidingWindow_u1() {
        val result = Solution().maxSlidingWindow(intArrayOf(1,2,1,0,4,2,6), 3)
        assertContentEquals(result, intArrayOf(2,2,4,4,6))
    }


    @Test
    fun maxSlidingWindow_u2() {
        val result = Solution().maxSlidingWindow(intArrayOf(1,3,-1,-3,5,3,6,7), 3)
        assertContentEquals(result, intArrayOf(3,3,5,5,6,7))
    }

    @Test
    fun maxSlidingWindow_u3() {
        val result = Solution().maxSlidingWindow(intArrayOf(7, 2, 4), 2)
        assertContentEquals(result, intArrayOf(7, 4))
    }

    @Test
    fun maxSlidingWindow_s1() {
        val result = Solution().maxSlidingWindow(intArrayOf(1), 1)
        assertContentEquals(result, intArrayOf(1))
    }

    @Test
    fun maxSlidingWindow_decreasing() {
        val result = Solution().maxSlidingWindow(intArrayOf(1,2,1,0,4,2,6), 3)
        assertContentEquals(result, intArrayOf(2,2,4,4,6))
    }

    @Test
    fun maxSlidingWindow_decreasing2() {
        val result = Solution().maxSlidingWindow(intArrayOf(1,3,1,2,0,5), 3)
        assertContentEquals(result, intArrayOf(3,3,2,5))
    }
}

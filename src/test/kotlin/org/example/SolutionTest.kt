package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun maxSlidingWindow_returnsIntArrayOfSizeOne() {
        val result = Solution().maxSlidingWindow(intArrayOf(1, 2, 3), 3)
        assertEquals(1, result.size)
    }
}

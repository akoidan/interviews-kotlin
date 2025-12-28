package org.example

data class WindowItem(
    val index: Int,
    val value: Int
)

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {

        val deq = ArrayDeque<WindowItem>()
        deq.add(WindowItem(0, nums[0]))
        for (i in 1 until k) {
            if (nums[i] >= deq[0].value) {
                deq.clear()
                deq.add(WindowItem(i, nums[i]))
            } else if (i - deq[0].index > k){

            }
        }
    }
}

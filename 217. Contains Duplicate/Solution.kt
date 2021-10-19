class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        // val map = mutableMapOf<Int, Int>()
        // for (num in nums)
        //     if (map.contains(num)) return true
        //     else map[num] = 1
        // return false
        return !(nums.size == nums.toSet().size)
    }
}
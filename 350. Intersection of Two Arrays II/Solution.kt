fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map1 = mutableMapOf<Int, Int>()
    val map2 = mutableMapOf<Int, Int>()
    var res = intArrayOf()
    //
    for (num in nums1) {
        if (map1.containsKey(num)) {
            map1[num] = map1[num]!! + 1
        } else map1[num] = 1
    }
    //
    for (num in nums2) {
        if (map2.containsKey(num)) {
            map2[num] = map2[num]!! + 1
        } else map2[num] = 1
    }

    val bigMap = if (map1.keys.size < map2.keys.size) map2 else map1
    val smallMap = if (map1.keys.size < map2.keys.size) map1 else map2
    for (key in smallMap.keys)
        if (bigMap.containsKey(key))
            repeat(minOf(smallMap[key]!!, bigMap[key]!!)) { res += key }

    return res
}

fun main() {
    val nums1 = intArrayOf(4,9,5)
    val nums2 = intArrayOf(9,4,9,8,4)
    println("nums1: ${nums1.joinToString(" ")}")
    println("nums2: ${nums2.joinToString(" ")}")
    println(intersect(nums1, nums2).joinToString(" "))
}
/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
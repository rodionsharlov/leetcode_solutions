fun rotate(nums: IntArray, k: Int): Unit {
    if (k % nums.size != 0) {
        val lefts = intArrayOf(nums.size - k % nums.size, 0, 0)
        val rights = intArrayOf(nums.lastIndex, nums.size - k % nums.size - 1, nums.lastIndex)

        for (ind in lefts.indices)
            while(lefts[ind] < rights[ind]) {
                nums[lefts[ind]] = nums[rights[ind]].also { nums[rights[ind]] = nums[lefts[ind]] }
                lefts[ind]++
                rights[ind]--
            }
    }
}

fun main () {
    var nums: IntArray
    nums = intArrayOf(1,2,3,4,5,6,7,8,9)
    // >             [7,8,9,1,2,3,4,5,6]
    var k = 3
    println(nums.joinToString(" "))
    rotate(nums, k)
    println(nums.joinToString(" "))
}
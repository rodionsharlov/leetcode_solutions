fun rob(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]
    if (nums.size == 2) return maxOf(nums[0], nums[1])
    nums[2] += nums[0]
    if (nums.size == 3) return maxOf(nums[2], nums[1])
    //
    for (i in 3..nums.lastIndex) nums[i] += maxOf(nums[i - 2], nums[i - 3])
    return maxOf(nums[nums.lastIndex], nums[nums.lastIndex - 1])
}

fun main() {
    val nums = intArrayOf(1,3,1,1,1,1,3)//(2,7,9,3,1)
    println(rob(nums))
}
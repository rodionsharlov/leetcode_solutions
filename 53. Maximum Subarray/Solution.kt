fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    if (nums.size == 1) return maxSum

    var ind = 0
    var curSum: Int = nums[ind]
    ind++

    while (ind < nums.size) {
        curSum += nums[ind]
        curSum = maxOf(curSum, nums[ind])
        maxSum = maxOf(curSum, maxSum)
        ind++
    }
    return maxSum
}

fun main() {

    val nums = intArrayOf/*(5,4,-1,7,8)*/ (-2,1,-3,4,-1,2,1,-5,4) //
    println(maxSubArray(nums))
}
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size
    while (left < right) {
        val mid = left + (right - left) / 2
        if (nums[mid] > target) {
            right = mid
        } else if (nums[mid] < target) {
            left = mid + 1
        }
        else if (nums[mid] == target) {
            return mid
        }
    }
    return left
}

fun main () {
    val nums = intArrayOf(1,2,4)
    val target = 3
    println(searchInsert(nums, target))
}
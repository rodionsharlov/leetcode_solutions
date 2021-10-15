fun search(nums: IntArray, target: Int): Int {
    var result = -1

    var left = 0
    var right = nums.size
    var ind = (left + right) / 2
    var prevInd = ind

    while(true) {
        if (nums[ind] > target) right = ind
        else if (nums[ind] < target) left = ind
        else if (nums[ind] == target) {
            result = ind
            break
        }
        prevInd = ind
        ind = (left + right) / 2

        if (ind == prevInd)
            break
    }
    return result
}

fun main() {
    val arr = intArrayOf(-1,0,3,5,9,12,13)
    val arr2 = arr + -2
    arr2.forEach { print("${search(arr, it)} ") }
}
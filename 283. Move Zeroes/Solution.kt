/*
fun moveZeroes(nums: IntArray): Unit {

    var insertPosition = -1
    var segmentStart = -1
    var segmentEnd = -1

    for ((index, num) in nums.withIndex()) {
        if (num != 0) {
            if (insertPosition != -1) {
                segmentStart = if (segmentStart == -1) index else segmentStart
                segmentEnd = index
            }
        }
        else if  (num == 0) {
            if (insertPosition == -1) insertPosition = index
            else {
                if (segmentStart != -1) {
                    var shift = 0
                    while (shift <= segmentEnd - segmentStart) {
                        nums[insertPosition + shift] = nums[segmentStart + shift]
                        shift++
                    }
                    segmentStart = -1
                    segmentEnd = -1
                    insertPosition += shift
                }
            }
        }
    }

    // Edge case
    if (insertPosition != -1 && segmentStart != -1) {
        var shift = 0
        while (shift <= segmentEnd - segmentStart) {
            nums[insertPosition + shift] = nums[segmentStart + shift]
            shift++
        }
        insertPosition += shift
    }

    // Nullification
    if (insertPosition != -1)
        for (ind in insertPosition..nums.lastIndex)
            nums[ind] = 0

*/
// This solution is much much more clever and concise
fun moveZeroes(nums: IntArray): Unit {
    var lastNonZeroFoundAt = 0
    for (i in nums.indices)
        if (nums[i] != 0)
            nums[lastNonZeroFoundAt++] = nums[i]
    for (ind in lastNonZeroFoundAt..nums.lastIndex)
        nums[ind] = 0
}

fun main () {
    var nums: IntArray
    nums = intArrayOf(1,0,0,0,0,4,0,0,0,0,8)//0,1,0,3,12)
    // >             [1,3,12,0,0]
    println(nums.joinToString(" "))
    moveZeroes(nums)
    println(nums.joinToString(" "))
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    var result = IntArray(2)
    for ((index, num) in nums.withIndex()) {
        if (map.contains(num)) {
            result[0] = map[num]!!
            result[1] = index
            break
        }
        map[target - num] = index
    }
    return result
}

fun main () {
    var nums: IntArray
    nums = intArrayOf(-2, -1, 0, 1) //2, 3, 4) //2,7,11,15)
    val target = -1 //6 //9
    // >
    println(nums.joinToString(" "))
    println(twoSum(nums, target).joinToString(" "))
}
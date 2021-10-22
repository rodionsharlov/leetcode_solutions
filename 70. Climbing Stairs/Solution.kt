fun climbStairs(n: Int): Int {
    var previousCount = 0
    var currentCount = 1
    repeat(n) { currentCount += previousCount.also { previousCount = currentCount } }
    return currentCount
}

fun main() {
    val n = 7
    println(climbStairs(n))
}
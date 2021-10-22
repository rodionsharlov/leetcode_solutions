fun minCostClimbingStairs(cost: IntArray): Int {
    for (i in 2..cost.lastIndex) cost[i] += minOf(cost[i - 1], cost[i - 2])
    return minOf(cost[cost.lastIndex], cost[cost.lastIndex - 1])
}

fun main() {
    val cost = intArrayOf(1,100,1,1,1,100,1,1,100,1)
    println(minCostClimbingStairs(cost))
}
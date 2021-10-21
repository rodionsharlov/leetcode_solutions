fun maxProfit(prices: IntArray): Int {
    // Brute force algorithm
    /*
    var profit = 0
    for (indB in prices.indices)
        for (indS in indB..prices.lastIndex)
            profit = maxOf(prices[indS] - prices[indB], profit)
    return profit
    */

    var maxProfit = 0
    // Only one price available
    if (prices.size == 1) return maxProfit
    //
    var minPrice = Int.MAX_VALUE
    for (price in prices)
        if (price < minPrice) minPrice = price
        else maxProfit = maxOf(maxProfit, price - minPrice)

    return maxProfit
}

fun main() {
    val prices = intArrayOf(7,1,5,3,6,4)
    println("prices: ${prices.joinToString(" ")}")
    println(maxProfit(prices))
}
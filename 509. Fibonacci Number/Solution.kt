// F(n) = F(n - 1) + F(n - 2), for n > 1.
fun fib(n: Int): Int {
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1

    var res: Int = 0
    var nMinusOne = 1
    var nMinusTwo = 1
    for (i in 3..n) {
        res = nMinusOne + nMinusTwo
        nMinusTwo = nMinusOne
        nMinusOne = res
    }
    return res
}

fun main() {

    val n = 4
    println(fib(n))
}


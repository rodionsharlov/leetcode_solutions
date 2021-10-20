// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// T_3 = 0 + 1 + 1 = 2
// T_4 = 1 + 1 + 2 = 4

fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1

    var res: Int = 0
    var nMinusOne = 1
    var nMinusTwo = 1
    var nMinusThree = 0
    for (i in 3..n) {
        res = nMinusOne + nMinusTwo + nMinusThree
        nMinusThree = nMinusTwo
        nMinusTwo = nMinusOne
        nMinusOne = res
    }
    return res
}
// 25
// Output: 1389537
fun main() {

    val n = 25
    println(tribonacci(n))
}
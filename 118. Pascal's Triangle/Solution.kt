fun generate(numRows: Int): List<List<Int>> {
    var numberOfItems = 1
    val res = List(numRows) { MutableList(numberOfItems++) { 1 } }
    if (numRows > 2) {
        var row = 2
        while (row < numRows) {
            for (i in 1 until res[row].lastIndex)
                res[row][i] = res[row - 1][i - 1] + res[row - 1][i]
            row++
        }
    }
    return res
}

fun main() {
    val numRows = 2
    println(generate(numRows))
}
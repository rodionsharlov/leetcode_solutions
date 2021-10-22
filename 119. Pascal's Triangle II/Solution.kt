fun getRow(rowIndex: Int): List<Int> {
    val numRows = rowIndex + 1
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
    return res[rowIndex]
}

fun main() {
    val rowIndex = 1
    println(getRow(rowIndex))
}
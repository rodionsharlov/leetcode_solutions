fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (r * c != mat.size * mat[0].size) return mat
    val res = Array(r) { IntArray(c) { 0 } }
    var mir = 0
    var mic = 0
    for (ir in 0..res.lastIndex)
        for (ic in 0..res[ir].lastIndex) {
            res[ir][ic] = mat[mir][mic]
            if (mic == mat[mir].lastIndex) {
                mic = 0
                mir++
            } else mic++
        }
    return res
}

fun main() {
    //val mat = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
    val mat = arrayOf(intArrayOf(1,2))
    val r = 2
    val c = 1
    val res = matrixReshape(mat, r, c)
    res.forEach { println(it.joinToString(" ")) }
}
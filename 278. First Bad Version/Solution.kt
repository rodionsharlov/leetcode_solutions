fun isBadVersion(n: Int): Boolean {
    val arr = arrayOf (false, false, false, false, true, true)
    return arr[n]
}

fun firstBadVersion(n: Int): Int {
    var left = 1
    var right = n
    while (left < right) {
        val mid = left + (right - left) / 2
        if (isBadVersion(mid)) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}

fun main() {
    println(firstBadVersion(5))
}
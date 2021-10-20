fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    // Straightforward copying of nums2 element into nums1 array
    // Nothing to merge, just blindly copy
    if (m == 0) {
        for (i in 0 until n)
            nums1[i] = nums2[i]
        return
    }
    // Do nothing
    if (n == 0) return
    // Else
    var i = 0
    var i1 = 0
    var i2 = 0
    var canUseNums1 = true
    var canUseNums2 = true

    val aux = nums1.slice(0 until m).toIntArray()

    while (i < m + n) {
        if (canUseNums1) {
            if (canUseNums2) {
                if (aux[i1] <= nums2[i2]) {
                    nums1[i] = aux[i1]
                    i1++
                    if (i1 == m) canUseNums1 = false
                } else {
                    nums1[i] = nums2[i2]
                    i2++
                    if (i2 == n) canUseNums2 = false
                }
            } else {
                nums1[i] = aux[i1]
                i1++
                if (i1 == m) canUseNums1 = false
            }
        }
        else if (canUseNums2) {
            nums1[i] = nums2[i2]
            i2++
            if (i2 == n) canUseNums2 = false
        }
        else break // finish
        i++
    }
}

fun main () {
    var nums1: IntArray
    var nums2: IntArray
    nums1 = intArrayOf(1,2,3,0,0,0)
    val m = 3
    nums2 = intArrayOf(2,5,6)
    val n = 3

    println("${nums1.joinToString(" ")} | ${nums2.joinToString(" ")}")
    merge(nums1, m, nums2, n)
    println("${nums1.joinToString(" ")} |")
}
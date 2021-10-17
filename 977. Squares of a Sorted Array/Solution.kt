/*
fun sortedSquares(nums: IntArray): IntArray {
    var output = IntArray(0)
    var negMults = IntArray(0)
    var negInd = -1

    for (num in nums) {
        val mult = num * num
        if (num < 0 ) {
            negMults += mult
            negInd = negMults.lastIndex
        } else {
            if (negInd > -1) {
                while (negInd > -1) {
                    if (mult >= negMults[negInd]) {
                        output += negMults[negInd]
                        negInd--
                    } else break
                }
            }
            output += mult
        }
    }
    if (negInd > -1) {
        for (ind in negInd downTo 0) {
            output += negMults[ind]
        }
    }
    return output
}
*/
// Better solution adapted from the forum
fun sortedSquares(nums: IntArray): IntArray {
    val l = nums.size
    val f = IntArray(l)
    var s = 0
    var e = l - 1
    var i = l - 1

    while (s <= e) {
        val a = nums[s] * nums[s]
        val b = nums[e] * nums[e]
        if (a > b) {
            f[i] = a
            s++
        } else {
            f[i] = b
            e--
        }
        i--
    }
    return f
}

fun main () {
    var nums: IntArray
    nums = intArrayOf(-7,-3,2,3,11)
    // > 4 9 9 49 121
    nums = intArrayOf(-4,-1,0,3,10)
    // > 0 1 9 16 100
    nums = intArrayOf(-11, 10)
    // > 100 121

    println(nums.joinToString(" "))
    println(sortedSquares(nums).joinToString(" "))
}
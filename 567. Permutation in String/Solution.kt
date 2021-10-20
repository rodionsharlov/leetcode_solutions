fun checkInclusion(s1: String, s2: String): Boolean {
    var left = 0
    var right = s1.length - 1
    val setS1 = s1.toSet()

    // Use maps if needed
    if (setS1.size != s1.length) {
        val mapS1 = mutableMapOf<Char, Int>()
        for (l in s1)
            if (!mapS1.containsKey(l)) mapS1[l] = 1
            else mapS1[l] = mapS1[l]!! + 1

        // accepted version
        while (right < s2.length) {
            val mapS2 = mutableMapOf<Char, Int>()
            for (l in s2.slice(left..right))
                if (!mapS2.containsKey(l)) mapS2[l] = 1
                else mapS2[l] = mapS2[l]!! + 1

            if (mapS2 == mapS1) return true
            else {
                left++
                right++
            }
        }
    }
    // Otherwise, use sets
    else {

        while (right < s2.length) {
            val setS2 = s2.slice(left..right).toSet()
            if (setS2.containsAll(setS1)) return true
            else {
                left++
                right++
            }
        }
    }
    return false
}

fun main() {
    val s1 = "heloo"//"ab"
    val s2 = "ooolleoooleh"//"eidboaoo"
    println("$s1 $s2")
    println(checkInclusion(s1, s2))
}
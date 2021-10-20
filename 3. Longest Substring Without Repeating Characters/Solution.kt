fun lengthOfLongestSubstring(s: String): Int {
    if (s == "") return 0

    var left = 0
    var right = 0
    var maxLength = 0

    while (true) {
        val windowWidth = right - left + 1
        if (s.slice(left..right).toSet().size == windowWidth) {
            maxLength = windowWidth
            right++
        } else {
            left++
            right++
        }
        if (right == s.length) break
    }

    return maxLength
}

fun main() {
    val input = "pwwkew"//"abcabcbb"
    println(input)
    println(lengthOfLongestSubstring(input))
}
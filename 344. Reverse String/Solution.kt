fun reverseString(s: CharArray): Unit {
    var l = 0
    var r = s.lastIndex
    while (l < r) {
        s[l] = s[r].also {s[r] = s[l]}
        l++
        r--
    }
}

fun main () {
    var input = charArrayOf('h')//,'e','l','l','o')
    println(input.joinToString(" "))
    reverseString(input)
    println(input.joinToString(" "))
}
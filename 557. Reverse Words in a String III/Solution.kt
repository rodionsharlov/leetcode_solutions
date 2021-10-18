fun reverseWords(s: String): String {
    var ss = s.toCharArray()
    var start = -1
    var end = -1
    for ((ind, chr) in ss.withIndex()) {
        if (chr != ' ') {
            start = if (start == -1) ind else start
            end = ind
        }
        if ((chr == ' ' && start != -1) || ind == ss.lastIndex) {
            var l = start
            var r = end
            while (l < r) {
                ss[l] = ss[r].also { ss[r] = ss[l] }
                l++
                r--
            }
            start = -1
            end = -1
        }
    }
    return ss.joinToString("")
}

fun main () {
    var s = "t" //Let's take LeetCode contest t"
    println(s)
    println(reverseWords(s))
}
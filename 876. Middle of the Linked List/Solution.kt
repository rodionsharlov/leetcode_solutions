/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var arr = Array<ListNode?>(100){ null }
        var ind = 0
        var node = head
        while (node != null) {
            arr[ind++] = node
            node = node.next
        }
        return arr[ind / 2]
    }
}
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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        // Отсечка особых случаев
        if (head == null || head.next == null && n == 1 )
            return null

        var delayedNode = head
        var currentNode = head

        // Один из указателей уходит вперёд на n шагов
        repeat(n) {
            currentNode = currentNode!!.next
        }

        // Для случаев типа [1, 2] n =2 (Отсечка особых случаев)
        if (currentNode == null)
            return head.next
        // Отсечка выше оберегает от обращения к null.next

        // Продолжаем траверс, но уже двумя указателями с дистанцией n между ними
        while (currentNode!!.next != null) {
            currentNode = currentNode!!.next
            delayedNode = delayedNode!!.next
        }

        // Отстающим указателем просто перепрыгиваем элемент, которые требуется удалить из цепи
        delayedNode!!.next = delayedNode!!.next!!.next
        return head
    }
}
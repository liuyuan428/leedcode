package easy;

import java.awt.*;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val+", ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reverse(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode next = null;
        ListNode h = head;
        while(head.next!=null){
            next = head.next;
            head.next = next.next;
            next.next = h;
            h = next;
        }
        return h;
    }
}
class Solution {
    //discuss
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        if(head.next==null)
            return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode s = reverseList(slow.next);
        ListNode.printList(s);
        ListNode.printList(head);
        while(s != null){
            System.out.println("s"+head.val);
            System.out.println(s.val);
            if(head.val!=s.val)

                return false;
            head = head.next;
            s = s.next;
        }
        return true;
    }

    //单链表反转
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode next = null;
        ListNode h = head;
        while(head.next!=null){
            next = head.next;
            head.next = next.next;
            next.next = h;
            h = next;
        }
        return h;
    }
}

public class Reverse_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h = new ListNode(2);
        head.next = h;
        ListNode.printList(head);
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(head));

    }
}

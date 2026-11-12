/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
      ListNode slow=head;
      ListNode fast=head;
      ListNode temp=new ListNode();
      temp=head;
      ListNode y=null;
      while(fast!=null&&fast.next!=null){
        y=slow;
        slow=slow.next;
        fast=fast.next.next;
      }  
      y.next=slow.next;
      return head;
    }
}
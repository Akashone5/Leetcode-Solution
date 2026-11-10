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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode head2=new ListNode();
    head2.next=head;
    ListNode temp=head2;
    ListNode tail=temp;
    for(int i=0;i<=n;i++){
        temp=temp.next;
    }
    while(temp!=null){
        temp=temp.next;
        tail=tail.next;
    }
    tail.next=tail.next.next;
    return head2.next;

    }
}
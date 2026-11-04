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
    public boolean isPalindrome(ListNode head) {
//    ArrayList<Integer> al=new ArrayList<>();
//     ListNode slow=head;
//     ListNode fast=head;
//     while(fast!=null&&fast.next!=null){
//         slow=slow.next;
//         fast=fast.next.next;
//     }    
//     int i=0;
//     int j=al.size()-1;
//     while(i<j){
//         while(al.get(i).equals(al.get(j))){
            
//         }
//     }
    Stack<Integer> st=new Stack<>();
    ListNode temp=head;
    while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
    }
    temp=head;
    while(temp!=null){
        if(temp.val!=st.pop()){
            return false;
        }
        temp=temp.next;
    }
    return true;
    }
}
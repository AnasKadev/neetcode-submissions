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
     int l=0;
     ListNode res=new ListNode();
     res.next=head;
     ListNode lnode=head;
     while(lnode!=null){
        l++;
        lnode=lnode.next;

        
     }
     if(n-l==0)
     return head.next;
     int i=1;
     
     while(i!=l-n && head.next!=null){
        head=head.next;
        i++;
     }
       
       head.next=head.next.next;
     return res.next;


    }
}

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pres=head;
        ListNode prev=null;
       if(left==right)
       {
           return head;
       }
       for(int i=0;i<left-1 && pres!=null;i++)
       {
           prev=pres;
           pres=pres.next;
       }
       ListNode last=prev;
       ListNode newEnd=pres;
        ListNode fut=pres.next;
       for(int i=0;pres!=null && i<right-left+1;i++)
       {   
        pres.next=prev;
        prev=pres;
        pres=fut;

        if(fut!=null)
        {
            fut=fut.next;
        }
        }
        if(last!=null)
        {
            last.next=prev;
        }
        else
        {
            head=prev;
        }
        newEnd.next=pres;

        return head;
     }
}
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
    public ListNode swapNodes(ListNode head, int k) {
        int n=1;
        ListNode temp=head;
    
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        if(n<k){
            return head;
        }
        ListNode start=head;
        ListNode startprev=null;
        ListNode end=head;
        for(int i=1;i<k;i++){
            startprev=start;
            start=start.next;
        }
        int count=n-k;
        ListNode endprev=null;
        while(count!=0){
            endprev=end;
            end=end.next;
            
            count--;
        }
     int rev=start.val;
     start.val=end.val;
     end.val=rev;

        return head;

        

        
    }
    
}
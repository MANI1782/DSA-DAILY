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
    public ListNode swapPairs(ListNode head) {
        ListNode left=head;
        ListNode right=head;
        ListNode res=null;
        int size=2;
        ListNode prevleft=null;
        while(true){
            right = left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }
            if(right!=null){
                ListNode nextleft=right.next;
                reverse(left,size);
                if(prevleft!=null){
                    prevleft.next=right;
                    
                }
                prevleft=left;
                if(res==null){
                    res=right;
                }
                left.next = nextleft;
                left=nextleft;
            }else{
                if(prevleft!=null){
                    prevleft.next=left;
                }
                if(res==null){
                    res=left;
                }
                break;
            }
        }
        return res;
    }
    void reverse(ListNode head,int size){
        ListNode curr=head;
        ListNode prev=null;
        while(size!=0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            size--;
            
        }
        
    }
}
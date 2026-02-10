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
       List<Integer> ans=new ArrayList<>();
       while(head!=null){
        ans.add(head.val);
        head=head.next;

       }
       int left=0;
       int right=ans.size()-1;


        while(left<=right){
            if(ans.get(left)!=ans.get(right)){
                return false;
            }else{
                right--;
                left++;
            }
           
        }
        return true;
        
    }
    

    
}
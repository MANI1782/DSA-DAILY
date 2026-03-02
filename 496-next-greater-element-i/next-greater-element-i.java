class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> ans=new HashMap<>();

        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<nums2.length;i++){

            while(!stk.isEmpty() && stk.peek()<nums2[i]){
                ans.put(stk.pop(),nums2[i]);
            }
            stk.push(nums2[i]);   
        }
    
        while(!stk.isEmpty()){
            ans.put(stk.pop(),-1);
        }
        int[] res=new int[nums1.length];
        for(int k=0;k<nums1.length;k++){
            res[k]=ans.get(nums1[k]);
        }
        return res;

        
        
    }
}
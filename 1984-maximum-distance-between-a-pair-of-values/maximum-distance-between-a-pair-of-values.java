class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res=Integer.MIN_VALUE;
        int i=0; // 55 30 5 4 2   // 100 20 10 10 5
        int j=0; //  i                j  

         while(j<nums2.length && i<nums1.length){
            if(nums1[i]<=nums2[j]){
               if(i<=j){
                 res=Math.max(res,j-i);
               }
                j++;
                
            }
            else {
                i++;
            }
         }
         
    
         
         return res==Integer.MIN_VALUE?0:res;
        
    }
}
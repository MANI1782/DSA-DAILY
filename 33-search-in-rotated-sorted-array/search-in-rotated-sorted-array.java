class Solution {
    public int search(int[] nums, int target) {
        int end1=searchMin(nums);
        int ans=binarysearch(0,end1-1,nums,target);
        int ans1=binarysearch(end1,nums.length-1,nums,target);
        if(ans==-1){
            return ans1;
        }else{
        return ans;
         }
   
     
             
    } 
       public int searchMin(int[] nums){
         int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
    public int binarysearch(int left,int right,int nums[],int target){
       
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
                
            }else{
                left=mid+1;
            }
        }
        return -1;
    }

}






    


        
    
 
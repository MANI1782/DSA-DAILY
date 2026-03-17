class Solution {
    public int search(int[] nums, int target) {
        int min=searchMin(nums) ;
    int left=0;
    int right=nums.length-1;
    int n=nums.length;
    while(left<=right){
        int mid1 = left + (right - left) / 2;
        int mid=(min+mid1)%n;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            left=mid1+1;
        }else{
            right=mid1-1;
        }
        }
          return -1;
    


       

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

}






    


        
    
 
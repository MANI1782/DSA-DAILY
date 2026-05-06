class Solution {
    public int compareBitonicSums(int[] nums) {
        int peak=binarySearch(nums,0,nums.length-1);
        long leftsum=0;
        for(int i=0;i<=peak;i++){
            leftsum=leftsum+nums[i];
        }
        long rightsum=0;
        for(int i=peak;i<nums.length;i++){
            rightsum=rightsum+nums[i];
        }
        if(leftsum<rightsum){
            return 1;
        }if(leftsum>rightsum){
            return 0;
        }
        return -1;
        
        
    }
    int binarySearch(int nums[],int low,int right){
        while(low<right){
            int mid=low+(right-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
                
            }
            else{
                right=mid;
            }
        }
        return low;
    }
}
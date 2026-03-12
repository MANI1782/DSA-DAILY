class Solution {
    public void rotate(int[] nums, int k) {
        
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        if(n==1){
            return ;
        }
        if(n==0){
            return ;
        }
        k=k%n;
        
        
        reverse(nums,start,n-k-1);
        reverse(nums,n-k,end);
        reverse(nums,start,end);
       
   
    }
    void reverse(int nums[], int start,int end){
       
       while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
       }
    }
}
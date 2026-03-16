class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int ans=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
              
                 right=mid;
                
            }else if(arr[mid]<arr[mid+1]){
                ans=mid;
                left=mid+1;
               
            }
        }
        return left;
        
    }
}
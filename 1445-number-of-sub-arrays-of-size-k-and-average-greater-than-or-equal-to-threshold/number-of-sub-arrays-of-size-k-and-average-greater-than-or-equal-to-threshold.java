class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low=0;
        int avg=0;
        int count=0;

        for(int high=0;high<arr.length;high++){
            avg+=arr[high];

            while(high-low+1 > k){
                avg=avg-arr[low];
                low++;
            }
            if(high-low+1==k){
                double ans=(double)avg/k;

                if(ans>=threshold){
                    count++;
                   
                }
            }

        }
        return count;
        
    }
}
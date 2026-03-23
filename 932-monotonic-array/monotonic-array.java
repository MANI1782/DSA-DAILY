class Solution {
    public boolean isMonotonic(int[] nums) {
        if(isMono(nums) || notMono(nums)){
            return true;
        }else{
            return false;
        }
  

        
    }
    boolean isMono(int arr[]){
        for(int i=1;i<arr.length;i++){
            if( arr[i] >= arr[i-1] ){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    boolean notMono(int arr[]){
        for(int i=1;i<arr.length;i++){
            if( arr[i] <= arr[i-1] ){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
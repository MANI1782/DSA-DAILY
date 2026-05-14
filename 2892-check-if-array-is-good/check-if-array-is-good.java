class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;

        for(int num:nums){  // 1 2 3 3 //3
            if(num>max){ // 1 1 2 3 4 4
                max=num;
            }
            count++;
        }
        Arrays.sort(nums);
        if(nums.length!=max+1){
            return false;
        }
        int i=0;
        
        while(i<nums.length-2){
            if(nums[i]==i+1){
               i++;
             
            }else{
                return false;   ////1 1 2 
            }
            
            
        }
       

        return nums[nums.length-1]==max && nums[nums.length-2]==max;

        
    }
}


//[5, 7, 3, 1, 5, 2, 6, 4]  //7
//1 2 3 4 5 5 6 7
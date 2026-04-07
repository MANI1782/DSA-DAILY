class Solution {
    public int[] decompressRLElist(int[] nums) {
       int size=0; 
       for(int i=0;i<nums.length;i=i+2){
        size=size+nums[i];
       }

       int[] res=new int[size];

       int i=0;
       int j=1;
       int idx=0;
       while(j<nums.length){
        int freq=nums[i];
        int val=nums[j];

        for(int k=0;k<freq;k++){
            res[idx]=val;
            idx++;

        }
        i=i+2;
        j=j+2;
       }
       return res;
       
    }
}
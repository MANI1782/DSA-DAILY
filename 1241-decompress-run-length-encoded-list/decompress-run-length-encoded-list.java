class Solution {
    public int[] decompressRLElist(int[] nums) {
        
       int i=0;
       int j=1;
        List<Integer> list=new ArrayList<>();
       while(j<nums.length){
        int freq=nums[i];
        int val=nums[j];

        for(int k=0;k<freq;k++){
            list.add(val);
        }
        i=i+2;
        j=j+2;

       }
       int m=0;
       int[] res=new int[list.size()];
        for(int num:list){

            res[m]=list.get(m);
            m++;
        }
        return res;
        
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> pos=new ArrayList<>();
       List<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
        }
          for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
        }

        int[] ans=new int[nums.length];
        int i=0;
        int j=0;
        int k=0;
    
        while(i<pos.size() && j<neg.size()){
                ans[k]=pos.get(i);
                k++;
                i++;
                ans[k]=neg.get(j);
                j++;
                k++;
        }
        return ans;

        
    }
}
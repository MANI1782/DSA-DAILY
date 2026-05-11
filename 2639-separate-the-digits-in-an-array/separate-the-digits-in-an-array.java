class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--){
                int num=nums[i];
                while(num>0){
                    list.add(num%10);
                    num=num/10;
                }
        }
        Collections.reverse(list);
        int[] ans=new int[list.size()];
        int idx=0;
        for(int num:list){
            ans[idx]=list.get(idx);
            idx++;
        }
        return ans;
          
    }
    
}
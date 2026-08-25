class Solution {
    public int missingMultiple(int[] nums, int k) {
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        
            set.add(nums[i]);
       }

       int mul=k;
       int n=2;
        int result=0;
        while(true)
        {
            if(!set.contains(mul))
            {
                result=mul;
                break;
            }
            else
            {
                mul=k*n;    
            }
            n++;
        }
      
        return result;

    }
}



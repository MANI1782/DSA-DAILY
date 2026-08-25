class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int num=k;
        int res=0;
       
        
        while(true){
            if(!set.contains(num)){
               res=num;
               break;
                
            }
            num=num+k;
           
            
            
        }
        return res;
        
    }
}


/* class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int num=k;
        int res=k;
        
        while(set.contains(res)){
           
            num=res;
            res=res*2;
            
        }
        return num;
        
    }
} */
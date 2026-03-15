class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res=Integer.MAX_VALUE;
        int index=-1;
      if (capacity == null || capacity.length == 0) return -1;
      
        for(int i=0;i<capacity.length;i++){
            int negative=-1;
            if(capacity[i]>=itemSize){
                int sum=capacity[i]-itemSize;
                if(sum<res){
                    res=sum;
                    index=i;
                    

                }
                    
                
            }
        }
        return index;
}
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int left=1;
    int right=0;
    
     for(int pile:piles){
        
        right=Math.max(right,pile);
     }
        int res=-1;
        while(left<=right){
            int mid = (left+right) / 2;
            long ans=speed(piles,mid);
            if(ans<=h){
                res=mid;
                right=mid-1;
                
            }
                 
               
            else{
                
                 left=mid+1;
               
        }
        }
        return res;
        
    }
        public long speed(int nums[],int speed){
            long h=0;
            for(int i=0;i<nums.length;i++){
                h=h+nums[i]/speed;
                if(nums[i]%speed!=0){
                    h=h+1;
                }
            }
            return h;
        }
}

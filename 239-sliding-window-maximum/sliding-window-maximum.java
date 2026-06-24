class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int low=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->b[0]-a[0]
        );
        int[] ans=new int[nums.length];
        int i=0;

        for(int high=0;high<nums.length;high++){  // 1 -1
            
            pq.offer(new int[]{nums[high] , high});
            while(pq.peek()[1]<=high-k){
                pq.poll();
           
               

                
               
            }
            if(high>=k-1){
                ans[i]=pq.peek()[0];
                i++;
            }   
        }
        return Arrays.copyOf(ans,i);
        
    }
    
}
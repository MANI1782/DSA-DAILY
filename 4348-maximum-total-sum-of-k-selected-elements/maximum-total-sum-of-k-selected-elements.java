class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
      
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        while(k!=0){
            int ele=pq.poll();
            if(mul>0){
                long res=(long)ele*mul;
                 sum=sum+res;
            }else{
                long res=(long)ele;
                 sum=sum+res;
            }
           
            k--;
            mul--;
        }
        return sum;

        
    }
}
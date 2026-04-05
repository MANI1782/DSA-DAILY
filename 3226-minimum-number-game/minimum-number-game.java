class Solution {
    public int[] numberGame(int[] nums) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums){
            pq.add(num);
        }

        int[] res=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            int poll1=pq.poll();
            int poll2=pq.poll();
            res[i]=poll2;
            i++;
            res[i]=poll1;
            i++;
        }
        return res;
        
    }
}
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]); 
        }

        int times=k; //10+8+5+3
        while(times!=0){
            int ans=pq.poll();
            long sq=(long)Math.sqrt(ans);
            pq.add((int)sq);

            
            times--;
        }
        while(!pq.isEmpty()){
            int ans=pq.poll();
            count+=(long)ans;
        }
        return count;



        
    }
}
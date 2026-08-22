class Solution {
    public int maximumScore(int a, int b, int c) {
       
        int count=0;
        

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        pq.add(a);
        pq.add(b);
        pq.add(c);
        while(pq.size()>=2){
            
            int ans1=pq.poll();
            int ans2=pq.poll();
            if(ans1==0){
                break;
            }
            ans1--;
            ans2--;
             count++;
            
            if(ans1>0){
                pq.add(ans1);

            }
            if(ans2>0){
                pq.add(ans2);
            }
           
        
        }
        return count;
        
    }
}
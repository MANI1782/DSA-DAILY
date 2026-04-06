class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
   
        for(int num:stones){
            pq.add(num);
        }

        while(pq.size()>1){
            
            int num1=pq.poll();
            int num2=pq.poll();

            if(num1==num2) continue;

            else{
                int res=Math.abs(num1-num2);
                pq.add(res);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
        
    }
}
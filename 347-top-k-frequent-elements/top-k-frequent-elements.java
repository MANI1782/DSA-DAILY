class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                    
                }
                return a.second-b.second;
            }
        );
            
      
    

        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            Pair current=new Pair(value,key);   

            if(pq.size()<k){
                pq.add(current);
                continue;
            } else{
                if(pq.peek().first>current.first){
                    continue;
                }else{
                    pq.poll();
                    pq.add(current);
                }
            }
        }
        int[] res=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.peek().second;
            pq.poll();
            i++;
        }
        return res;




        
    }
}

class Pair{
    int first;
    int second;

    Pair(int f,int s){
        first=f;
        second=s;
    }
}
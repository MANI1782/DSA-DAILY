class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                }
                return b.second.compareTo(a.second);
                
            }
        );

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            String key=entry.getKey();
            

            Pair current=new Pair(value,key);
            
            pq.add(current);
            if(pq.size()>k){
                pq.poll();
            }
            
        }
         List<String> list=new ArrayList<>();
         
         while(!pq.isEmpty()){
            list.add(pq.poll().second);
            
         }
         Collections.reverse(list);
         return list;
      
    }
}

class Pair{
    int first; //frequency
    String second; //string

    Pair(int f,String s){
        this.first=f;
        this.second=s;
    }
}

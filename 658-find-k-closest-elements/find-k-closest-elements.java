class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

            PriorityQueue<Pair> pq=new PriorityQueue<>(
                (a,b)->{
                    if(a.second!=b.second){
                        return Integer.compare(b.second,a.second);
                    } return Integer.compare(b.first,a.first);
                    
                    
                }
            );

            for(int num:arr){
                int ans=Math.abs(num-x);

                Pair pair=new Pair(num,ans);
                pq.add(pair);
                if(pq.size()>k){
                    pq.poll();
                }
            }
            List<Integer> list=new ArrayList<>();
            while(!pq.isEmpty()){
                list.add(pq.poll().first);
                
            } 
             Collections.sort(list);
        return list;
    }
}



class Pair{
    int first; //values
    int second; // |x-a|

    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
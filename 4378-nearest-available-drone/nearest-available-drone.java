class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.diff!=b.diff){
                    return Integer.compare(a.diff,b.diff);
                }
                return Integer.compare(a.index,b.index);
            }
        );
        for(int i=0;i<drones.length;i++){
            int ans=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            int range=drones[i][2];
            if(ans<=range){
            Pair pair=new Pair(ans,i);
            pq.add(pair);
            }
           
        }
        if(pq.isEmpty()) return -1;

        return pq.poll().index;
        
       
        
    }
}
class Pair{
    int diff;
    int index;
    Pair(int diff,int index){
        this.diff=diff;
        this.index=index;
    }
}
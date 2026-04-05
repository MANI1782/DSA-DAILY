class Solution {
    public String[] findRelativeRanks(int[] score) {
        
       PriorityQueue<Pair> pq=new PriorityQueue<>(
        (a,b)->{
            if(a.score!=b.score){
                return Integer.compare(b.score,a.score);
            }
            return a.index-b.index;
        }
       );

       for(int i=0;i<score.length;i++){
        Pair pair=new Pair(score[i],i);
        pq.add(pair);
       }

       String[] res=new String[score.length];
       int rank=1;
       while(!pq.isEmpty()){
        int index = pq.poll().index;

        if(rank==1)  res[index]="Gold Medal";
        else if(rank==2) res[index]="Silver Medal";
        else if(rank==3) res[index]= "Bronze Medal";
        else res[index]=String.valueOf(rank);
        rank++;

       }
       return res;

   
        
    }
}
class Pair{
    int score;
    int index;
    Pair(int s,int i){
        this.score=s;
        this.index=i;
    }

}
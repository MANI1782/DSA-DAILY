class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.soldier!=b.soldier){
                    return Integer.compare(b.soldier,a.soldier);
                   
                }
                 return Integer.compare(b.row,a.row);
                
            }
        );
        int row=0;
        for(int[] nums:mat){
            int soldier=0;
            for(int val:nums){
                if(val==1) soldier++;
                else break;

               
            }
            Pair pair=new Pair(row,soldier);
            pq.add(pair);
            if(pq.size()>k){
                pq.poll();
            }
            
            row++;

        }
        
        int[] res=new int[k];
      for(int i=k-1;i>=0;i--){
        res[i]=pq.poll().row;
      }
      return res;
        
    }
}
class Pair{
    int row;
    int soldier;
    Pair(int r,int s){
        this.row=r;
        this.soldier=s;
    }
}
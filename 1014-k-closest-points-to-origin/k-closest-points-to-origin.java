class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                
                return Double.compare(b.second,a.second);
            }
        );

        
        
        for(int index=0;index<points.length;index++){
            int[] point=points[index];
            double dist=distance(point);
           
            Pair pair=new Pair(index,dist);
            pq.add(pair);

            if(pq.size()>k){
                pq.poll();
            }

        }
     
        int[][] res=new int[k][2];

        int i=0;
    
        while(!pq.isEmpty()){
            int index=pq.poll().first;
            res[i]=points[index];
            i++;
            
        }
        return res;


        
    }
    double distance(int[] pair){
        int x1=0;
        int y1=0;
        
        int x2=pair[0];
        int y2=pair[1];

        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
       
        
    }
        
       
    
}

class Pair{
    int first; //index
    double second;  //distance

    Pair(int f,double s){
        this.first=f;
        this.second=s;
    }
}
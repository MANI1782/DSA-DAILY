class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> list=new ArrayList<>();
        int start1=occupiedIntervals[0][0];
        int end1=occupiedIntervals[0][1];;
  
        for(int i=1;i<occupiedIntervals.length;i++){
            int start2=occupiedIntervals[i][0];
            int end2=occupiedIntervals[i][1];
            if(end1+1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }else{
                list.add(Arrays.asList(start1,end1));
                start1=start2;
                end1=end2;
            }
           
            
        }
        list.add(Arrays.asList(start1,end1));
         List<List<Integer>> ans=new ArrayList<>();
        int s1=freeStart;
        int e1=freeEnd;
      
        for(int j=0;j<list.size();j++){
            int s2=list.get(j).get(0);
            int e2=list.get(j).get(1);
            if(e2<s1 || s2>e1){
                ans.add(Arrays.asList(s2,e2));;
            }else{
                if(s1>s2 ){ 
                ans.add(Arrays.asList(s2,s1-1));

            }
            if(e2>e1){
                ans.add(Arrays.asList(e1+1,e2));
            }
            }
        }


        
        return ans;
        
    }
}
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=1;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int a=intervals[0][0];
        int b=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int c=intervals[i][0];
            int d=intervals[i][1];
            if(d<=b && a<=c){
                
                continue;
            }else{
                count++;
                a=c;
                b=d;
            }
        }
        return count;
        
    }
}
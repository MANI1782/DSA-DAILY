class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start1=newInterval[0];
        int end1=newInterval[1];
    List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(end2<start1){
                ans.add(Arrays.asList(start2,end2));
            }
            else if(start2>end1){
                ans.add(Arrays.asList(start1,end1));
                start1=start2;
                end1=end2;
            }else{
                start1=Math.min(start1,start2);
                end1=Math.max(end1,end2);
            }
            
        }
        ans.add(Arrays.asList(start1,end1));
        int[][] answer=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            answer[i][0]=ans.get(i).get(0);
            answer[i][1]=ans.get(i).get(1);
        }
        return answer;
        
    }
}
class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int maxsum=0;
      for(int num:cardPoints) maxsum=maxsum+num;

      int window=cardPoints.length-k;
    int low=0;
      int minsum=0;
      int res=Integer.MAX_VALUE;
     for(int i=0;i<cardPoints.length;i++){
        minsum=minsum+cardPoints[i];

        if(i-low+1>window){
            minsum=minsum-cardPoints[low];
            low++;
        }
        if(i-low+1==window){
            res=Math.min(res,minsum);
        }

     }
     return maxsum-res;



    }
}
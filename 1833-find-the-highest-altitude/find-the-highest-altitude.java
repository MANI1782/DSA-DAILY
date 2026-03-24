class Solution {
    public int largestAltitude(int[] gain) {
        long max=0;
        long sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            max=Math.max(sum,max);
            
        }
        return (int)max;
    }
}
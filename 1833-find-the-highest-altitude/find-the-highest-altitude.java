class Solution {
    public int largestAltitude(int[] gain) {
        long sum = 0;
        long max = 0;
        for(int i=0; i<gain.length; i++){ 
            sum+=gain[i];
            max = Math.max(max,sum);
           
        }
    return (int)max;    
    }
}
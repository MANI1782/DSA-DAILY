class Solution {
    public int largestAltitude(int[] gain) {
      long sum=0;
      long res=0;
      for(int num:gain){
        sum=sum+num;
        res=Math.max(sum,res);
      }
      return (int)res;
    }
}
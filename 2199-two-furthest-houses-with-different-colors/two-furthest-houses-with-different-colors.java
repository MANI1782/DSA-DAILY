class Solution {
    public int maxDistance(int[] colors) {

        int res=Integer.MIN_VALUE;

        int i=0;
        int j=1;
        while(j<colors.length){
            if(colors[i]!=colors[j]){
                res=Math.max(res,j-i);
            }
            j++;
        }

        int last=colors.length-1;
        int k=colors.length-2;
        while(k>=0){
            if(colors[k]!=colors[last]){
                res=Math.max(res,last-k);
            }
            k--;
        }
        return res;
        
    }
}
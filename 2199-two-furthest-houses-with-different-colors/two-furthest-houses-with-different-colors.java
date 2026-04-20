class Solution {
    public int maxDistance(int[] colors) {

        int res=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    res=Math.max(res,j-i);
                }
            }
        }
        return res;
        
    }
}
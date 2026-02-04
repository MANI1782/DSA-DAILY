class Solution {
    public int heightChecker(int[] heights) {
       
       
        int ans=0;
        int[] copy=heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(copy[i]==heights[i]){
                continue;
            }else{
                ans++;
            }
            
        }
        return ans;


    }
}
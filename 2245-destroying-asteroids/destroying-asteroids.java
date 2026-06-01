class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        Arrays.sort(asteroids);

        // 3 5 9 19 21;

        
        long sum=mass;

        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=sum){
                sum=sum+(long)asteroids[i];
            }else{
                return false;
            }

        }
        return true;
    }
}
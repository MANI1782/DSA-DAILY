    class Solution {
        public int minOperations(int[] nums) {
            int i=0;
            int j=1;
            int count=0;
            while(i<nums.length && j<nums.length){
                int even=nums[i];
                int odd=nums[j];
            
                while(!prime(even)){
                        count++;
                        even=even+1;
                }
        
                while(prime(odd)){
                        count++;
                        odd=odd+1;
                }
                
                i=i+2;
                j=j+2;
            }
            while(i<nums.length){
                int even=nums[i];
                while(!prime(even)){
                    count++;
                    even++;
                }
                i++;
            }
            return count;
            
        }
        boolean prime(int n){
            if (n <= 1) return false;
            int count=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
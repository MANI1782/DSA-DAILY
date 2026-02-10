class Solution {
    public boolean isPalindrome(String s) {
       
        String last=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    
        int left=0;
        int right=last.length()-1;
        while(left<right){
            if(last.charAt(left)!=last.charAt(right)){
                
              return false;
            }
            else{
                right--;
                left++;
            }
          
        }
        return true;

        
    }
}
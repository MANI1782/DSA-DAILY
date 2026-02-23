class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x<0){
            return false;
        }
            
            int sum = 0;
            while(num!=0){
                int last_digit = num%10;
                sum = (sum*10) + last_digit;
                num = num/10;
            }
            if(sum==x){
                return true;
            }
        return false;
           


    }
}
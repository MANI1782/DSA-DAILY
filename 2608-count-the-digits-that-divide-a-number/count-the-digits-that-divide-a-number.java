class Solution {
    public int countDigits(int num) {
        int count = 0;

        // We use a 'temp' variable so we don't lose the original value of 'num'
        for (int temp = num; temp > 0; temp /= 10) {
            // 1. Get the last digit
            int lastDigit = temp % 10;
            
            // 2. Check if the original 'num' is divisible by this digit
            // (num % lastDigit == 0) means there is no remainder
            if (num % lastDigit == 0) {
                count++;
            }
        }
        
        return count;
    }
}
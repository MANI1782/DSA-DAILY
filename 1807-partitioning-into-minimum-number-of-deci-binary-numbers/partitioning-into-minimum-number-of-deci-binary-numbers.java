class Solution {
    public int minPartitions(String n) {
        int max=0;
        char[] arr=n.toCharArray();
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            if(digit>max){
                max=digit;
            }
             if(max == 9) {
                break;
            }
        }
        return max;

        
    }
}
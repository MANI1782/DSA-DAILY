class Solution {
    public int findNumbers(int[] nums) {
    //     int find=0;
    //     int i=0;
    //     int count=0;
    // while(i<nums.length){
    //     int lastDigit=nums[i]%10;
    //     nums[i]=nums[i]/10;
    //     find++;
    //     if(find%2==0){
    //         count++;
    //     }

    // }
    // return count;
    int count=0;
   
    for(int i=0;i<nums.length;i++){
        int currentNum=nums[i];
        int find=0;
        while(currentNum!=0){
            currentNum=currentNum/10;
            find++;
        }
        if(find%2==0){
            count++;
        }
       
       
    }
    return count;
    }
}
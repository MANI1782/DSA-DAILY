class Solution {
    public int missingNumber(int[] nums) {
       
Arrays.sort(nums);
if (nums[0] != 0) {
            return 0;
        }
for(int i=1;i<nums.length;i++){
  if(nums[0]==1){
    return 0;
  }

    if(nums[i]-nums[i-1]==1){
        continue;
    }else if(nums[i]-nums[i-1]>1){
        return i;
    }
}
return nums.length;

}
}
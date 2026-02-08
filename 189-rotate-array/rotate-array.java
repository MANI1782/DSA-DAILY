class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        List<Integer> ans=new ArrayList<>();
        for(int i=n-k;i<n;i++){
            ans.add(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            ans.add(nums[i]);
        }
       for(int i=0;i<n;i++){
       nums[i]=ans.get(i);
       }
   
    }
}
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      List<Integer> idx=new ArrayList<>();
      int[] target=new int[nums.length];

      for(int i=0;i<index.length;i++){
            idx.add(index[i],nums[i]);
      }
      for(int i=0;i<nums.length;i++){
        target[i]=idx.get(i);
      }
      return target;
      
      
        
    }
}
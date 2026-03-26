class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            int count1=0;
            int count2=0;
            int[] ans=new int[2];
           Map<Integer,Integer> map1=new HashMap<>();
           for(int arr:nums1){
            map1.put(arr,map1.getOrDefault(arr,0)+1);
           }
           Map<Integer,Integer> map2=new HashMap<>();
           for(int arr:nums2){
            map2.put(arr,map2.getOrDefault(arr,0)+1);
           }
           for(int arr:nums2){
            if(map1.containsKey(arr)){
                count1++;
            }
           }
           for(int arr:nums1){
            if(map2.containsKey(arr)){
                count2++;
            }

        }
        ans[1]=count1;
        ans[0]=count2;
        return ans;
    }
}
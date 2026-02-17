class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j] ){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }
        }
       int[] store=new int[ans.size()];
       int idx=0;
       for(int k=0;k<ans.size();k++){
            store[idx]=ans.get(k);
            idx++;
       }
       return store;
    }
}
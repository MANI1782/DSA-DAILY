class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        Set<Integer> intersect=new HashSet<>();
        for(int j=0;j<nums2.length;j++){

            if(set1.contains(nums2[j])){
            intersect.add(nums2[j]);
        }
        }
        

        int[] arr=new int[intersect.size()];
        int k=0;
        for(int nums: intersect){
            arr[k]=nums;
            k++;
        }

        
        return arr;
        

        

    }
}
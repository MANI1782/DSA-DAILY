class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0; // 1 1 2     1 2 3

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            list.add(nums2[j]);
            j++;
        }
        int size=list.size();
        int mid=size/2;
        int mid1=(size/2)-1;
        if(size%2==0){
            return (double)(list.get(mid1)+list.get(mid))/2;
            
        }
        return (double)list.get(size/2);
    }
}
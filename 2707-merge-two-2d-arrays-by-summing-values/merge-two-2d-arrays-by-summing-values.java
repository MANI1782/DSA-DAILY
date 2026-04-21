class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list=new ArrayList<>();

        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;

        while(i<n1 && j<n2){
            if(nums1[i][0]==nums2[j][0]){
                list.add(Arrays.asList(nums1[i][0],nums1[i][1]+nums2[j][1]));
                i++;
                j++;
            }else if(nums1[i][0]<nums2[j][0]){
                list.add(Arrays.asList(nums1[i][0],nums1[i][1]));
                i++;
            }else if(nums1[i][0]>nums2[j][0]){
                list.add(Arrays.asList(nums2[j][0],nums2[j][1]));
                j++;
            }

        }
        while(i<n1){
            list.add(Arrays.asList(nums1[i][0],nums1[i][1]));
            i++;
        }
        while(j<n2){
            list.add(Arrays.asList(nums2[j][0],nums2[j][1]));
            j++;
        }

        int[][] res=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
            res[k][0]=list.get(k).get(0);
            res[k][1]=list.get(k).get(1);
        }
        return res;
    }
}
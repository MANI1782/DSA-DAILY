class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
         List<Integer> b=new ArrayList<>();
       Set<Integer> set1=new HashSet<>();
       for(int arr:nums1){
        if(!set1.contains(arr)){
            set1.add(arr);
        }
       }

       Set<Integer> set2=new HashSet<>();
       for(int arr:nums2){
        if(!set2.contains(arr)){
            set2.add(arr);
        }
       }

       for(int arr:set2){
        if(!set1.contains(arr)){
            a.add(arr);
        }
       }

        for(int arr:set1){
        if(!set2.contains(arr)){
            b.add(arr);
        }

       }
       ans.add(b);
       ans.add(a);
       
       return ans;


        
        
    }
}
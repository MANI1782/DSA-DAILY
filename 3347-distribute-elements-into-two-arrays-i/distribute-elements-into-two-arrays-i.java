class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int i=0;
        int j=0;
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int k=2;k<nums.length;k++){
            if(list1.get(i) > list2.get(j)){
                list1.add(nums[k]);
                i++;

            }else{
                list2.add(nums[k]);
                j++;
            }
        }
        list1.addAll(list2);
        int[] res=new int[list1.size()];
        int m=0;
        for(int b=0;b<list1.size();b++){
            res[m]=list1.get(b);
            m++;
        }
        
        return res;


        
    }
}
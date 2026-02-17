class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> ans1=new HashMap<>();
        Map<Integer,Integer> ans2=new HashMap<>();
        for(int i=0;i<target.length;i++){
            ans1.put(target[i],ans1.getOrDefault(target[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            ans2.put(arr[i],ans2.getOrDefault(arr[i],0)+1);
        }

        if(ans1.equals(ans2)){
            return true;
        }
        return false;
    }
}
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        
      for(int i=1;i<arr.length;i++){
        int ans=Math.abs(arr[i-1]-arr[i]);
        min=Math.min(min,ans);
      }
      
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i-1]-arr[i])==min){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
       return res;
     
     
    }
}
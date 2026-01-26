class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       
        List<List<Integer>> result=new ArrayList<>();
         Arrays.sort(arr);
      
            int mindiff=Integer.MAX_VALUE;
            for(int k=1;k<arr.length;k++){
                mindiff=Math.min(mindiff,arr[k]-arr[k-1]);
            }

            for(int i=1;i<arr.length;i++){
        
            if(arr[i]-arr[i-1]==mindiff){
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        
           
            }
             return result;
    }
       
    }

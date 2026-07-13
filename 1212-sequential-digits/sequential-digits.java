class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String s="123456789";
        
        for(int start=0;start<s.length();start++){
            for(int end=start;end<s.length();end++){
                String ans=s.substring(start,end+1);
                int res=Integer.parseInt(ans);
                if(res>=low && res<=high){
                    list.add(res);
                }
            }
            
            
        }
        Collections.sort(list);
        return list;

        
    }
}
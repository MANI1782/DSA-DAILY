class Solution {
    public String kthDistinct(String[] arr, int k) {
        StringBuilder sb=new StringBuilder();
        Map<String,Integer> map=new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String s:arr){
            if(map.get(s)==1){
                count++;
                if(count==k){
                sb.append(s);
            }
            }
           
        }
        return sb.toString();
        
    }
}
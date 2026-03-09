class Solution {
    public int maxVowels(String s, int k) {
       
        int max=0;
       int  count=0;
       int low=0;
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
        }
            while(i-low+1>k){
                int left=s.charAt(low);
               if(left=='a' || left=='e' || left=='i' || left=='o' || left=='u'){  
                count--;
               }
             
                low++;
            }
            max=Math.max(max,count);


        }
        return max;
        
    }
   
}
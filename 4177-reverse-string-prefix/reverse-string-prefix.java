class Solution {
    public String reversePrefix(String s, int k) {

        return rev(s,k);


    }

    String rev(String s,int k){
        int i=0;
        int j=k-1;
        char[] ch=s.toCharArray();

        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
           
        
           
            
        }
        StringBuilder sb=new StringBuilder();
         for(char c:ch){
                sb.append(c);
            }
        return sb.toString();

    }

    
}
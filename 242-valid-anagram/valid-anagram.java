class Solution {
    public boolean isAnagram(String s, String t) {
      char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       if(a.length!=b.length){
        return false;
       }
       Arrays.sort(a);
       Arrays.sort(b);
       int i=0;
       int j=0;
       while(i<b.length){
        if(a[i]==b[j]){
            i++;
            j++;
        }
        else{
            return false;
        }
       }
       return true;
    }
}
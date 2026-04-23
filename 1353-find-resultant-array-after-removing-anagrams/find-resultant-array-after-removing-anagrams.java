class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        String prevkey=null;

        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String ans=new String(ch);

            if(prevkey==null || !ans.equals(prevkey)){
                list.add(words[i]);
                prevkey=ans;
            }
        }
        return list;
    }
}
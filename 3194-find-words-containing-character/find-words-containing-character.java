class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();

        int i=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(ch==x){
                    list.add(i);
                    break;
                }
            }
            i++;
        }
        return list;

     
        
    }
}
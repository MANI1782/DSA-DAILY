class Solution {
    public String[] findWords(String[] words) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"qwertyuiop");
        map.put(2,"asdfghjkl");
        map.put(3,"zxcvbnm");
        String[] str=new String[words.length];
        int z=0;
        for(int i=0;i<words.length;i++){
            String one=map.get(1);
            String two=map.get(2);
            String three=map.get(3);
            
            String word=words[i].toLowerCase();
            boolean on=false;
                boolean tw=false;
                boolean th=false;
            for(int j=0;j<word.length();j++){
                
                char ch=word.charAt(j);
                if(one.contains(String.valueOf(ch))){
                    on=true;
                }else if(two.contains(String.valueOf(ch))){
                    tw=true;
                }else if(three.contains(String.valueOf(ch))){
                    th=true;
                }
            }
            if(on && !tw && !th){
                str[z]=words[i];
                z++;
            }
            if(!on && tw && !th){
                str[z]=words[i];
                z++;
            }
            if(!on && !tw && th){
                str[z]=words[i];
                z++;
            }

        }
        return Arrays.copyOf(str,z);
        
    }
}
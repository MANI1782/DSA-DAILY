class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0;
        int score=0;
        int res[]=new int[2];

        for(String s:events){
            if(counter==10){
                break;
            }
            if(s.equals("NB") || s.equals("WD")){
                score+=1;
            }else if(s.equals("W")){
                counter+=1;
            }else{
                int num=Integer.parseInt(s);
                score+=num;
            }
        }
        res[0]=score;
        res[1]=counter;
        return res;
        
    }
}
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        String plus="X++";
        String plus1="++X";
        String sub="--X";
        String sub1="X--";
        for(String s:operations){
            if(s.contains(plus) || s.contains(plus1)){
            count=count+1;
            }else{
                count=count-1;
            }
        
        }
        return count;
    }
}
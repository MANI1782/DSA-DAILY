class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int num=n;
        while(num>0){
            int digit=num%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            num=num/10;
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            int asn=key*value;
            count+=asn;
        }
        return count;
        
    }
}
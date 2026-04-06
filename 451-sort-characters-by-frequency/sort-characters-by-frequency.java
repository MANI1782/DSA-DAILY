class Solution {
    public String frequencySort(String s) {

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.times!=b.times){
                    return Integer.compare(b.times,a.times);
                }
                return Character.compare(a.ch,b.ch);
            }
        );
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            
           map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            int time=map.get(c);

            Pair pair=new Pair(time,c);

            pq.add(pair);
        }
        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            sb.append(pq.poll().ch);
            
        }

    return sb.toString();


        
        
    }
}
class Pair{
    int times;
    char ch;
    Pair(int t,char c){
        
        this.times=t;
        this.ch=c;
    }
}
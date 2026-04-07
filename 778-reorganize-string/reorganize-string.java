class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return Integer.compare(b.freq,a.freq);
                }
                return Character.compare(b.ch,a.ch);
            }
        );
 int size=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            size=size+map.get(c);
        }
       
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char c=entry.getKey();
            int freq=entry.getValue();
            
            Pair pair=new Pair(freq,c);
            pq.add(pair);

        }
       
        StringBuilder sb=new StringBuilder() ;
        int i=0;
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
          
            if(i==0 || sb.charAt(i-1)!=pair.ch){
                sb.append(pair.ch);
                i++;
                pair.freq--;
                if(pair.freq>0){
                    pq.add(pair);
                }
            }else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair p=pq.poll();
                sb.append(p.ch);
                i++;
                p.freq--;
                if(p.freq>0){
                pq.add(p);
                }
           pq.add(pair);
            
        }
           
       

        }
        return sb.toString();

        
    }
}

class Pair{
    int freq;
    char ch;

    Pair(int f,char c){
        this.freq=f;
        this.ch=c;
    }
}
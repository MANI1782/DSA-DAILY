class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return Integer.compare(b.freq,a.freq);
                    
                }
                return Character.compare(b.ch,a.ch);
                
            }
        );
        int sub=0;
        for(int i=0;i<releaseTimes.length;i++){
            char ch=keysPressed.charAt(i);
            int freq=releaseTimes[i]-sub;
            Pair pair=new Pair(freq,ch);
            pq.add(pair);
            sub=releaseTimes[i];

        }
        Pair pair=pq.poll();
       

        return pair.ch;
        
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
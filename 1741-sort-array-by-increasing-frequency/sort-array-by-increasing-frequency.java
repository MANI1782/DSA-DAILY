class Solution {
    public int[] frequencySort(int[] nums) {

        PriorityQueue<Pair> pq=new PriorityQueue<>(

            (a,b)->{
                if(a.freq!=b.freq){
                    return Integer.compare(a.freq,b.freq);
                }
                return Integer.compare(b.arr,a.arr);
            }
        ); 

        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            int freq=map.get(num);
            Pair pair=new Pair(freq,num);
            pq.add(pair);
        }
        int[] res=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.poll().arr;
            i++;
        }
        return res;
        
    }
}

class Pair{
    int freq;
    int arr;
    Pair(int f,int a){
        this.freq=f;
        this.arr=a;
    }
}
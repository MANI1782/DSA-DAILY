class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res=new int[nums.length-k+1];
     
        Map<Integer,Integer> map=new HashMap<>();
        int low=0;
        int idx=0;
      
        for(int high=0;high<nums.length;high++){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);

            while(high-low+1>k){
                map.put(nums[low],map.get(nums[low])-1);
                             
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
            }
            if(high-low+1==k){
            PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return Integer.compare(b.freq,a.freq);
                }
                return Integer.compare(b.val,a.val);
            });

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                int val=entry.getKey();
                int freq=entry.getValue();
                Pair pair=new Pair(freq,val);
                pq.add(pair);
            }
                int times=x;
                int sum=0;
                while(times>0 && !pq.isEmpty()){
                    Pair p=pq.poll();
                    sum+=p.freq*p.val;
                    times--;
                }
                res[idx++]=sum;
            }
        }
        return res;   
    }
}
class Pair{
    int freq;
    int val;
    Pair(int f,int v){
        this.freq=f;
        this.val=v;
    }
}
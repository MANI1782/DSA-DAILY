class Solution {
    public int splitNum(int num) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(num>0){
            int last=num%10;  
            pq.add(last); //2 3 4 5
            num=num/10;
        }
        int sum1=0;
        int sum2=0;
        while(!pq.isEmpty()){
            sum1=(sum1*10)+pq.poll();//2 4
            if(!pq.isEmpty()){
            sum2=(sum2*10)+pq.poll(); //3
            }
            
        }
        return sum1+sum2;
        
    }
}
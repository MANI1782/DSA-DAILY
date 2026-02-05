class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       
        Arrays.sort(seats);
        Arrays.sort(students);
        int i=0;
        int j=0;
         int sum=0;
        int res=Integer.MAX_VALUE;
        while(i<seats.length && j<students.length){
     
            int ans=Math.abs(seats[i++]-students[j++]);
            sum=sum+ans;
         
            
        }
        res=Math.min(res,sum);
        return res;

    }
}
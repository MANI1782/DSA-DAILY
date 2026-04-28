class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();
        int rem=grid[0][0]%x;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]%x==rem){
                    list.add(grid[i][j]);
                    count+=grid[i][j];
                }else{
                    return -1;
                }
            }

        }
        Collections.sort(list);
        int median = list.get(list.size() / 2); //
        int steps=0;
        int i=0;
        while(i<list.size() ){
            int nums=list.get(i);
            while(nums<median){
                steps++;
                nums=nums+x;
            }
        
            while(nums>median){
                steps++;
                nums=nums-x;
            }
            i++;

            
        }
        return steps;
        
    }
}
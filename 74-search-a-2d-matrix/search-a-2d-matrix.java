class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int low=0;
        int high=(rows*columns)-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int matrixrow=mid/columns;
            int matrixcolumns=mid%columns;
            if(matrix[matrixrow][matrixcolumns]==target){
                return true;
            }if(matrix[matrixrow][matrixcolumns]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;

        
    }
}
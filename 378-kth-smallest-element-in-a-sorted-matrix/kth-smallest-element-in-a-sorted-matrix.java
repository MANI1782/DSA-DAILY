class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Node> pq=new PriorityQueue<>(new Compare());
        int times=k;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            
            pq.add(new Node(matrix[i][0],i,0));
            
            
            
            
        }
       while(times>1){
        Node node=pq.poll();
        int col=node.col;
        if(col<m-1){
            pq.add(new Node(matrix[node.row][col+1], node.row,col+1));

        }
               
       
        
        times--;

       }
       
       return pq.poll().value;

        
    }
}

class Node{
    int value;
    int row;
    int col;
    Node(int v,int r,int c){
        this.value=v;
        this.row=r;
        this.col=c;
    }
}
class Compare implements Comparator<Node>{
    public int compare(Node a,Node b){
        return Integer.compare(a.value,b.value);
    }
}
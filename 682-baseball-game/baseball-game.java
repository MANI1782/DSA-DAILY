class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<operations.length;i++){
            char ch=operations[i].charAt(0);
            if(!ans.isEmpty() && ch=='C'){
                ans.pop();
            }else if(!ans.isEmpty() && ch=='D'){
                int top=ans.peek();
                int multi=top*2;
                ans.push(multi);
            }else if(!ans.isEmpty() && ch=='+')
            {
                int top1=ans.pop();
                int top2=ans.peek();
                int sum=top1+top2;
                
                ans.push(top1);
                ans.push(sum);
            }
            else{
                ans.push(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        for(int k=0;k<ans.size();k++){
            sum=sum+ans.get(k);
        }
        return sum;
        
    }
}
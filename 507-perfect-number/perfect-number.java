class Solution {
    public boolean checkPerfectNumber(int num) {
        List<Integer> add=new ArrayList<>();
        if(ans(num)==num){
            return true;
        }
        return false;
        
    }
int ans(int n){
    int temp=n;
    int count=0;
  for(int i=1;i<n;i++){
    if(n%i==0){
        count=count+i;
    }
  }
  return count;
    }

}


class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<matches.length;i++){
            set.add(matches[i][1]);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        
        List<Integer> looser =new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<matches.length;i++){
            if(!set.contains(matches[i][0])){
               set1.add(matches[i][0]);
            }
            if(map.get(matches[i][1])==1){
                looser.add(matches[i][1]);
            }
        }
        List<Integer> winner =new ArrayList<>(set1);
        Collections.sort(winner);
        list.add(winner);
        Collections.sort(looser);
        list.add(looser);
        return list;
    }
}
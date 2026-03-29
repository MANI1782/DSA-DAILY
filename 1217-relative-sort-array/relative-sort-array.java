class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int idx = 0;
        int mapidx = 0; //3
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int index = map.get(num); //3
                mapidx = index;
                while (mapidx != 0) {
                    res[idx] = num;
                    idx++;
                    mapidx--;
                }
            } 
            map.remove(num);

        }

        List<Integer> remain=new ArrayList<>(map.keySet());
        Collections.sort(remain);
        for(int num:remain){
            mapidx=map.get(num);
            while(mapidx!=0){
                res[idx]=num;
                idx++;
                mapidx--;
            }
        }

        return res;

    }
}

//2-3 1-1 3-3
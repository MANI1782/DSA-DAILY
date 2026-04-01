class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : set) {
            pq.add(num);
            if (pq.size() > 3) {
                pq.poll();
            }
        }
        if (pq.size() == 3) {
            return pq.peek();
        } else {
            while (pq.size() > 1) {
                pq.poll();
            }
            return pq.peek();
        }

    }

}
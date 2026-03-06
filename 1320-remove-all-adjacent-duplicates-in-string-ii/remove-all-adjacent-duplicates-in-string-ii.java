class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        // int[] = [character, count]

        for(int i = 0; i < s.length(); i++) {
            char left = s.charAt(i);

            if(!stack.isEmpty() && stack.peek()[0] == left) {
                stack.peek()[1]++; // ✅ increment count
            } else {
                stack.push(new int[]{left, 1}); // ✅ push new char with count 1
            }

            if(stack.peek()[1] == k) {
                stack.pop(); // ✅ just pop once! removes [char, k]
            }
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stack.size(); i++) {
            int[] pair = stack.get(i);
            for(int j = 0; j < pair[1]; j++) {
                sb.append((char) pair[0]); // ✅ append char pair[1] times
            }
        }
        return sb.toString();
    }
}
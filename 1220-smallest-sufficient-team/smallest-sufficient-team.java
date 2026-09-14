class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int n = req_skills.length;
        Map<String, Integer> skillIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            skillIndex.put(req_skills[i], i);
        }

        int m = people.size();
        int[] personSkills = new int[m];
        for (int i = 0; i < m; i++) {
            int skillMask = 0;
            for (String skill : people.get(i)) {
                if (skillIndex.containsKey(skill)) {
                    skillMask |= (1 << skillIndex.get(skill));
                }
            }
            personSkills[i] = skillMask;
        }

        // dp array to store smallest team for each skill set
        List<Integer>[] dp = new List[1 << n];
        dp[0] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int skillSet = personSkills[i];
            if (skillSet == 0) continue; // person has no required skills

            for (int prev = 0; prev < dp.length; prev++) {
                if (dp[prev] == null) continue;

                int comb = prev | skillSet;
                if (comb == prev) continue; // no new skill added

                if (dp[comb] == null || dp[prev].size() + 1 < dp[comb].size()) {
                    dp[comb] = new ArrayList<>(dp[prev]);
                    dp[comb].add(i);
                }
            }
        }

        List<Integer> result = dp[(1 << n) - 1];
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

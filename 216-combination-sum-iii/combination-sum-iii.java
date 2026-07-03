class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        for (int a = 1; a <= 9; a++) {
            if (k == 1) {
                if (a == n) res.add(Arrays.asList(a));
                continue;
            }

            for (int b = a + 1; b <= 9; b++) {
                if (k == 2) {
                    if (a + b == n) res.add(Arrays.asList(a, b));
                    continue;
                }

                for (int c = b + 1; c <= 9; c++) {
                    if (k == 3) {
                        if (a + b + c == n) res.add(Arrays.asList(a, b, c));
                        continue;
                    }

                    for (int d = c + 1; d <= 9; d++) {
                        if (k == 4) {
                            if (a + b + c + d == n) res.add(Arrays.asList(a, b, c, d));
                            continue;
                        }

                        for (int e = d + 1; e <= 9; e++) {
                            if (k == 5) {
                                if (a + b + c + d + e == n) res.add(Arrays.asList(a, b, c, d, e));
                                continue;
                            }

                            for (int f = e + 1; f <= 9; f++) {
                                if (k == 6) {
                                    if (a + b + c + d + e + f == n)
                                        res.add(Arrays.asList(a, b, c, d, e, f));
                                    continue;
                                }

                                for (int g = f + 1; g <= 9; g++) {
                                    if (k == 7) {
                                        if (a + b + c + d + e + f + g == n)
                                            res.add(Arrays.asList(a, b, c, d, e, f, g));
                                        continue;
                                    }

                                    for (int h = g + 1; h <= 9; h++) {
                                        if (k == 8) {
                                            if (a + b + c + d + e + f + g + h == n)
                                                res.add(Arrays.asList(a, b, c, d, e, f, g, h));
                                            continue;
                                        }

                                        for (int i = h + 1; i <= 9; i++) {
                                            if (k == 9) {
                                                if (a + b + c + d + e + f + g + h + i == n)
                                                    res.add(Arrays.asList(a, b, c, d, e, f, g, h, i));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
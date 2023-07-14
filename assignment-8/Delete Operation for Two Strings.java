class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n < m) minDistance(s2, s1);

        char[] WA1 = s1.toCharArray();
        char[] WA2 = s2.toCharArray();
        
        int[] dpLast = new int[m + 1];
        int[] dpCurr = new int[m + 1];
        
        for (char c1 : WA1) {
            for (int j = 0; j < m; j++) {
                if (c1 == WA2[j]) {
                    dpCurr[j + 1] = dpLast[j] + 1;
                } else {
                    dpCurr[j + 1] = Math.max(dpCurr[j], dpLast[j + 1]);
                }
            }
            int[] tempArr = dpLast;
            dpLast = dpCurr;
            dpCurr = tempArr;
        }
        
        return n + m - 2 * dpLast[m];
    }
}
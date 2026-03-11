class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] r = new boolean[n + 1][n + 1];
        
        for (int[] result : results) {
            int win = result[0];
            int loose = result[1];
            r[win][loose] = true;
        }
        
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (r[i][k] && r[k][j]) {
                        r[i][j] = true;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (r[i][j] || r[j][i]) count++;
            }
            
            if (count == n - 1) result++;
        }
        return result;
    }
}
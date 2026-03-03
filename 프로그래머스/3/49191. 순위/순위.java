class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n + 1][n + 1];
        
        for (int i = 0; i < results.length; i++) {
            int winner = results[i][0];
            int looser = results[i][1];
            win[winner][looser] = true;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n ; j++) {
                    if (win[i][k] && win[k][j]) {
                        win[i][j] = true;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (win[i][j] || win[j][i]) count++;
            }
            
            if (count == n - 1) answer++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int n, int[][] results) {
        int[][] b = new int[n + 1][n + 1];
        
        for (int[] r : results) {
            int win = r[0];
            int loose = r[1];
            b[win][loose] = 1;
        }
        
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (b[i][k]  == 1 && b[k][j] == 1) {
                        b[i][j] = 1;
                    } 
                }
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (b[i][j] == 1 || b[j][i] == 1) count++;
            }
            
            if (count == n -1) answer++;
        }
        return answer;
    }
}
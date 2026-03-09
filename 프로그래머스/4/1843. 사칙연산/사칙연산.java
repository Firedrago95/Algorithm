import java.util.*;
class Solution {
    public int solution(String arr[]) {
        int n = arr.length / 2 + 1;
        
        int[][] maxDP = new int[n][n];
        int[][] minDP = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(maxDP[i], Integer.MIN_VALUE);
            Arrays.fill(minDP[i], Integer.MAX_VALUE);
            
            int num = Integer.parseInt(arr[i * 2]);
            maxDP[i][i] = minDP[i][i] = num;
        }

        for (int step = 1; step < n; step++) {
            for (int i = 0; i < n - step; i++) {
                int j = i + step;
                

                for (int k = i; k < j; k++) {
                    String op = arr[k * 2 + 1];
                    
                    if (op.equals("+")) {
                        maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] + maxDP[k + 1][j]);
                        minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] + minDP[k + 1][j]);
                    } else {
                        // 전체를 최대로 만들려면: (앞쪽 최대) - (뒤쪽 최소)
                        maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] - minDP[k + 1][j]);
                        // 전체를 최소로 만들려면: (앞쪽 최소) - (뒤쪽 최대)
                        minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] - maxDP[k + 1][j]);
                    }
                }
            }
        }

        return maxDP[0][n - 1];
    }
}
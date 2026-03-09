import java.util.*;
class Solution {
    public int solution(String arr[]) {
        // 1. 숫자의 개수 파악 (연산자 제외)
        int n = arr.length / 2 + 1;
        
        // maxDP[i][j]: i번째 숫자부터 j번째 숫자까지 연산했을 때의 최댓값
        // minDP[i][j]: i번째 숫자부터 j번째 숫자까지 연산했을 때의 최솟값
        int[][] maxDP = new int[n][n];
        int[][] minDP = new int[n][n];

        // 2. 초기 세팅 (가장 작은 단위인 '숫자 하나' 처리)
        for (int i = 0; i < n; i++) {
            // 일단 비교를 위해 아주 작거나 큰 값으로 채워둠 (리셋)
            Arrays.fill(maxDP[i], Integer.MIN_VALUE);
            Arrays.fill(minDP[i], Integer.MAX_VALUE);
            
            // i부터 i까지는 연산할 게 없으니 그냥 '숫자 그 자체'가 최대이자 최소
            int num = Integer.parseInt(arr[i * 2]);
            maxDP[i][i] = minDP[i][i] = num;
        }

        // 3. 본격적인 구간 DP 시작 (벽돌 쌓기)
        // step: 계산할 구간의 길이 (숫자 간의 거리)
        for (int step = 1; step < n; step++) {
            // i: 구간의 시작점
            for (int i = 0; i < n - step; i++) {
                // j: 구간의 끝점
                int j = i + step;
                
                // k: 구간을 나눌 기준점 (i와 j 사이의 연산자 위치)
                // (i ~ k) 구간과 (k+1 ~ j) 구간을 마지막에 연산한다고 가정
                for (int k = i; k < j; k++) {
                    // arr[k*2 + 1]은 k번째 숫자 바로 뒤에 있는 연산자
                    String op = arr[k * 2 + 1];
                    
                    if (op.equals("+")) {
                        // 더하기는 간단함: (앞쪽 최대 + 뒤쪽 최대)가 전체 최대
                        maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] + maxDP[k + 1][j]);
                        minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] + minDP[k + 1][j]);
                    } else {
                        // 빼기가 핵심! (마이너스 부호의 영향)
                        // 전체를 최대로 만들려면: (앞쪽 최대) - (뒤쪽 최소)
                        maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] - minDP[k + 1][j]);
                        // 전체를 최소로 만들려면: (앞쪽 최소) - (뒤쪽 최대)
                        minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] - maxDP[k + 1][j]);
                    }
                }
            }
        }

        // 최종 목적: 0번째 숫자부터 마지막(n-1) 숫자까지의 최댓값 반환
        return maxDP[0][n - 1];
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands 개수 만큼 담을 배열 생성
        int n = commands.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int target = commands[i][2] - 1;
            
            int[] parts = new int[end - start];
            for (int j = start; j < end; j++) {
                parts[j - start] = array[j];
            }
            
            Arrays.sort(parts);
            
            answer[i] = parts[target];
        }
        
        // commands 개수 만큼 for문 
        return answer;
    }
}
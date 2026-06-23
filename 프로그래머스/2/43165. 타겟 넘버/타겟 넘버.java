import java.util.*;
class Solution {
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0 ,0);
    }
    
    public int dfs(int[] numbers, int target, int count, int current) {
        if (count == numbers.length) {
            if (current == target) return 1;
            return 0;
        }
        
        int minus = dfs(numbers, target, count + 1, current - numbers[count]);
        int plus = dfs(numbers, target, count + 1, current + numbers[count]);
        
        return minus + plus;
    }
}
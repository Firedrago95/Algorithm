import java.util.*;
class Solution {
    
    public int solution(int[] numbers, int target) {
        return dfs (numbers, target, 0, 0);
    }
    
    public int dfs (int[] numbers , int target, int length, int sum) {
        if (length == numbers.length) {
            if (sum == target) return 1;
            return 0;
        }
        
        int plus = dfs (numbers, target, length + 1, sum + numbers[length]);
        int minus = dfs (numbers, target, length + 1, sum - numbers[length]);
        
        return plus + minus;
    }
}
import java.util.*;
class Solution {
    
    int count = 0;
    int[] numbers;
    int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        return count;
    }
    
    public void dfs (int length, int sum) {
        if (length == numbers.length) {
            if (sum == target) count++;
            return;
        }
        
        dfs(length + 1, sum + numbers[length]);
        dfs(length + 1, sum - numbers[length]);
    }
}
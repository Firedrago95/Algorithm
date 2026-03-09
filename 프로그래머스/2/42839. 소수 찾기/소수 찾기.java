import java.util.*;
class Solution {    
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        this.visited = new boolean[numbers.length()];
        
        backTrack(numbers, "");
        
        int count = 0;
        for (int n : set) {
            if (isPrime(n)) {
                count++;
            }
        }
        return count;
    }
    
    public void backTrack(String numbers , String input) {
        if (!input.isEmpty()) {
            set.add(Integer.parseInt(input));
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backTrack(numbers, input + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime (int n) {
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
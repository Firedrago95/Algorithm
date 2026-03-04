import java.util.*;
class Solution {    
    Set<String> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        this.visited = new boolean[numbers.length()];
        
        backtrack(numbers, "");
        System.out.println(set);
        return set.size();
    }
    
    private void backtrack(String input, String answer) {
        if (answer != null && check(answer)) {
            set.add(answer);
        }
        
        for (int i = 0; i < input.length(); i++) {
            if (!visited[i]) {
                
                visited[i] = true;
                backtrack(input, answer + input.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    private boolean check(String n) {
        if (n == null || n.isEmpty() || n.equals("1") || n.startsWith("0")) return false;
        int num = Integer.parseInt(n);
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
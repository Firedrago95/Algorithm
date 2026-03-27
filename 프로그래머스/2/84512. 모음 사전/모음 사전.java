import java.util.*;
class Solution {
    List<String> list = new ArrayList<>();
    String[] vowels = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        backtrack("");
        return list.indexOf(word) + 1;
    }
    
    public void backtrack(String current) {
        if (!current.equals("")) {
            list.add(current);
        }
        
        if (current.length() == 5) return;
        
        for (int i = 0; i < 5; i++) {
            backtrack(current + vowels[i]);
        }
    }
}
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) {
            String type = c[1];
            
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int result = 1;
        for (int v : map.values()) {
            result *= (v + 1);
        }
        return result - 1;
    }
}
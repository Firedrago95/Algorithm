import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String p : phone_book) {
            set.add(p);
        }
        
        for (String p : phone_book) {
            for (int j = 0; j < p.length(); j++) {
                String sp = p.substring(0,j);
                if (set.contains(sp)) return false;
            }
        }
        return true;
    }
}
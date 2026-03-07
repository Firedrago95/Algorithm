import java.util.*;
class Solution {
    public String solution(int[] numbers) {
       String[] s = new String[numbers.length];
        
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        
        if (s[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String a : s) {
            sb.append(a);
        }
        return sb.toString();
    }
}
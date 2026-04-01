import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (char n : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < n && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        
        while (k-- > 0) stack.pop();
        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
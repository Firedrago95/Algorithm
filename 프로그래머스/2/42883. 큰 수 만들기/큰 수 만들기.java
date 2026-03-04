import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peekLast() < c) {
                stack.removeLast();
                k--;
            }
            stack.addLast(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.substring(0, sb.length() - k);
    }
}
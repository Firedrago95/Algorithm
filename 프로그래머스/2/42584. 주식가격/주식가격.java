import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = (prices.length - 1) - pop;
        }
        return answer;
    }
}
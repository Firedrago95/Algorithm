import java.util.*;
class Solution {
    public int solution(int[] numbers) {
       List<Integer> num = new ArrayList<>();
        for (int number : numbers) {
            num.add(number);
        }
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!num.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}
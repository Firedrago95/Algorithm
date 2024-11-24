class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        for (int i = 0;  i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = absolutes[i] - (absolutes[i] * 2);
            }
        }
        long answer = 0;
        for (int i = 0;  i < absolutes.length; i++) {
            answer += (long) absolutes[i];
        }
        return (int) answer;
    }
}
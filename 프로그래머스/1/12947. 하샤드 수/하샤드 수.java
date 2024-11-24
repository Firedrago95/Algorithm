class Solution {
    public boolean solution(int x) {
        int plus = 0;
        int a = x;
        while (x > 0) {
            plus += x % 10;
            x /= 10;
        }
        return a % plus == 0;
    }
}
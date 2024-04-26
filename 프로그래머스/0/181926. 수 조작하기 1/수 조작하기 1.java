class Solution {
    public int solution(int n, String control) {
        char[] controls = control.toCharArray();
        for (char c : controls) {
            if (c == 'w') {
                n++;
            } else if (c == 's') {
                n--;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
         return n;
    }
}
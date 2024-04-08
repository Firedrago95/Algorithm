class Solution {
    public int solution(int a, int b) {
        int multiple = 2 * a * b;
        int calculation = Integer.parseInt("" + a + b);
        
        return Math.max(multiple, calculation);
    }
}
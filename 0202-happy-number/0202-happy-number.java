class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            n = calculate(n);
            if (n == 1) return true;
        }
        return false;
    }
    
    private int calculate (int n) {
        int result = 0;
        while (n > 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }

        return result;
    }
}
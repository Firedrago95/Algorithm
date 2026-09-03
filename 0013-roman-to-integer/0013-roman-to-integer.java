class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            int cur = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));

            if (cur < next) {
                total -= cur;
            } else {
                total += cur;
            }
        }

        return total + getValue(s.charAt(n - 1));
    }

    private int getValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
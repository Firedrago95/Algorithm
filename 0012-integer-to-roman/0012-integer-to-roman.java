class Solution {
    private final String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final int[] integer = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roman.length; i++) {
            while (num >= integer[i]) {
                sb.append(roman[i]);
                num -= integer[i];
            }
        }
        return sb.toString();
    }
}
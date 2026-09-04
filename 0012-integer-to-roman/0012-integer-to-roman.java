class Solution {
    public String intToRoman(int num) {
        int[] p = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] c = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p.length; i++) {
            while (num >= p[i]) {
                sb.append(c[i]);
                num -= p[i];
            }
        }
        return sb.toString();
    }
}
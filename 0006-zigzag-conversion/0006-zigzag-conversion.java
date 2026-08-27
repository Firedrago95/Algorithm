class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycle = (numRows - 1) * 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycle) {
                sb.append(s.charAt(j + i));

                int diagIdx = j + cycle - i;
                if (i != 0 && i != numRows - 1 && diagIdx < n) {
                    sb.append(s.charAt(diagIdx));
                }
            }
        }
        return sb.toString();
    }
}
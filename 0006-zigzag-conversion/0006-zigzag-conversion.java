class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        boolean isGoingDown = false;
        int currentRow = 0;

        for (char c : s.toCharArray()) {
            sbs[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                isGoingDown = !isGoingDown;
            }
            currentRow += isGoingDown ? 1 : -1;
        }
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            result.append(sb);
        }
        return result.toString();
    }
}
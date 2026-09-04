class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int point = s.length() - 1;

        while (point >= 0 && s.charAt(point) == ' ') {
            point--;
        }

        while (point >= 0 && s.charAt(point) != ' ') {
            length++;
            point--;
        }
        return length;
    }
}
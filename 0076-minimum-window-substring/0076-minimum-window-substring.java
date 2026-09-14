class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] count = new int[126];
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int required = t.length();
        int min = Integer.MAX_VALUE;
        int left = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            if (count[rc] > 0) {
                required--;
            }
            count[rc]--;

            while (required == 0) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                count[lc]++;
                if (count[lc] > 0) {
                    required++;
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
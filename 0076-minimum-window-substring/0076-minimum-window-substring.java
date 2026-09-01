class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            if (count[rChar] > 0) required--;

            count[rChar]--;

            while (required == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);
                count[lChar]++;
                if (count[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }    
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
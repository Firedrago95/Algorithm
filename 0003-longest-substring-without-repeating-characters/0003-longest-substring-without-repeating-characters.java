class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (set.contains(c)) {
                set.remove(s.charAt(start++));
            }

            set.add(c);
            maxLength = Math.max(maxLength, set.size()); 
        }
        return maxLength;
    }
}
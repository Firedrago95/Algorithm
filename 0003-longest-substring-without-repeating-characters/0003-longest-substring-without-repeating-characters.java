class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int result = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(c);
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}
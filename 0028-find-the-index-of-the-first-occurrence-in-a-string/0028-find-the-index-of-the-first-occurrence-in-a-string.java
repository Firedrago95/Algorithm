class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        int length = needle.length();

        for (int i = 0; i + length <= haystack.length(); i++) {
            String sub = haystack.substring(i, i + length);

            if (sub.equals(needle)) return i;
        }
        return -1;
    }
}
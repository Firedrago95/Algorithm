class Solution {
    public int strStr(String haystack, String needle) {
        int nl = needle.length();
        int hl = haystack.length();

        if (nl > hl) return -1;

        for (int i = 0; i <= hl - nl; i++) {
            String s = haystack.substring(i);
            if (s.startsWith(needle)) return i;
        }
        return -1;
    }
}
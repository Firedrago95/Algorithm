class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapS[sc] != mapT[tc]) {
                return false;
            }

            mapS[sc] = i + 1;
            mapT[tc] = i + 1;
        }
        return true;
    }
}
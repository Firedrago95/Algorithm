class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) return false;

            int count = map.getOrDefault(c, 0);
            if (count < 1) return false;
            map.put(c, count - 1);
        }
        return true;
    }
}
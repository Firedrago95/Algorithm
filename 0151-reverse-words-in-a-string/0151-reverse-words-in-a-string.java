class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) continue;
            sb.append(words[i]);
            if (i == 0) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}
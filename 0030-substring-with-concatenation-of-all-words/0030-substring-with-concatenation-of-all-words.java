class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;
        if (s.length() < totalLength) return result;

        Map<String, Integer> targetMap = new HashMap<>();
        for (String w : words) {
            targetMap.put(w, targetMap.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int count = 0;
            Map<String, Integer> currentMap = new HashMap<>();

            for (int right = i; right + wordLength <= s.length(); right += wordLength) {
                String sub = s.substring(right, right + wordLength);

                if (targetMap.containsKey(sub)) {
                    currentMap.put(sub, currentMap.getOrDefault(sub, 0) + 1);
                    count++;

                    while (currentMap.get(sub) > targetMap.get(sub)) {
                        String leftword = s.substring(left, left + wordLength);
                        currentMap.put(leftword, currentMap.get(leftword) - 1);
                        count--;
                        left += wordLength;
                    }

                    if (count == wordCount) result.add(left);
                } else {
                    currentMap.clear();
                    count = 0;
                    left = right + wordLength;
                }
            }
        }
        return result;
    }
}
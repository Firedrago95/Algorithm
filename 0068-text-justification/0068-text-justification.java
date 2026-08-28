class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < words.length) {
            int j = i + 1;
            int lineLength = words[i].length();

            // j번째 단어를 추가해도 (글자 수 + 최소 공백 수) maxWidth 이하인지 확인
            // (j-i)는 단어가 j - i + 1개일 때 필요한 최소 공백(1칸)개수입니다.
            while (j < words.length && 
                lineLength + words[j].length() + (j - i) <= maxWidth
            ) {
                lineLength += words[j].length();
                j++;
            }

            // 이번 줄에 들어갈 단어는 words[i] 부터 words[j]
            // 2단계 (i 부터 j-1 까지의 단어로 문자열 만들기)
            StringBuilder sb = new StringBuilder();
            int count = j - i; // 이번 줄에 들어갈 단어 개수

            // 1. 특수 케이스: 마지막 줄이거나 단어가 1개인 경우 (왼쪽 정렬)
            if (j == words.length || count == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                int totalSpaces = maxWidth - lineLength;
                int slots = count - 1;
                int baseSpace = totalSpaces / slots;
                int extraSpace = totalSpaces % slots;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < baseSpace; s++) sb.append(" ");
                        if (k - i < extraSpace) sb.append(" ");
                    }
                }
            }
            result.add(sb.toString());
            
            i = j; // 다음 줄 시작 위치로 이동
        }
        return result;
    }
}
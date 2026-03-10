import java.util.*;
class Node {
    String word;
    int count;
    
    public Node(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin , 0));
        
        while (!q.isEmpty()) {
            Node poll = q.poll();
            
            String word = poll.word;
            int count = poll.count;
            if (word.equals(target)) return count;
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(word, words[i])) {
                    q.add(new Node(words[i], count + 1));
                    visited[i] = true;
                }
            }
        }
        return 0;
    }
    
    private boolean canConvert(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) diffCount++;
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }
}
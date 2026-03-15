import java.util.*;
class Solution {
    boolean[] visited;
    ArrayList<Integer>[] tree;
    int answer = Integer.MAX_VALUE;
    public int solution(int n, int[][] wires) {
        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        for (int [] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            tree[a].add(b);
            tree[b].add(a);
        }
        
        for (int i = 0; i < wires.length; i++) {
            int count = countNodes(n, wires, i);
            answer = Math.min(answer, Math.abs(count - (n - count)));
        }
        return answer;
    }
    
    public int countNodes(int n, int[][] wires, int except) {
        visited = new boolean[n + 1];
        int v1 = wires[except][0];
        int v2 = wires[except][1];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int count = 1;
        while(!q.isEmpty()) {
            int current = q.poll();
            for (int next : tree[current]) {
                if ((current == v1 && next == v2) || (current == v2 && next == v1)) {
                    continue;
                }
                
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    count++;
                }
            }
        }
        return count;
    }
}
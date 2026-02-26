import java.util.*;
class Solution {
    
    ArrayList<Integer>[] graph;
    boolean[] visited;
    public int solution(int n, int[][] edge) {
        this.graph = new ArrayList[n + 1];
        this.visited = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < edge.length; i++) {
            int a = edge[i][0];
            int b = edge[i][1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        visited[1] = true;
        int answer = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            answer = size;
            
            for (int i = 0; i < size; i++) {
                int poll = q.poll();
                for (int node : graph[poll]) {
                    if (!visited[node]) {
                        visited[node] = true;
                        q.add(node);
                    }
                }
            }
        }
        return answer;
    }
}
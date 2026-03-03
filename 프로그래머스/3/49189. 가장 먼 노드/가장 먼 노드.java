import java.util.*;
class Solution {
    List<Integer>[] arr;
    boolean[] visited;
    public int solution(int n, int[][] edge) {
        this.visited = new boolean[n + 1];
        this.arr = new ArrayList[n + 1];
        
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < edge.length; i++) {
            int a = edge[i][0];
            int b = edge[i][1];
            arr[a].add(b);
            arr[b].add(a);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        visited[1] = true;
        int answer = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            answer = size;
            
            for (int i = 0; i < size; i++) {
                int poll = q.poll();
                for (int node : arr[poll]) {
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
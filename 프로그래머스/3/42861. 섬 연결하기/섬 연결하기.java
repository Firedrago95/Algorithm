import java.util.*;
class Solution {
    // 부모 노드를 찾는 함수 (Union-Find의 Find 연산 + 경로 압축)
    private int findParent(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }
        // 경로 압축(Path Compression)을 통해 탐색 속도 최적화
        return parent[node] = findParent(parent, parent[node]);
    }

    // 두 노드를 연결하는 함수 (Union-Find의 Union 연산)
    private void unionNodes(int[] parent, int node1, int node2) {
        int root1 = findParent(parent, node1);
        int root2 = findParent(parent, node2);

        // 두 노드의 최상위 부모가 다르다면 하나로 합침
        if (root1 != root2) {
            parent[root2] = root1;
        }
    }
    
    public int solution(int n, int[][] costs) {
        int totalCost = 0;
        int[] parent = new int[n];

        // 1. 부모 배열 초기화 (처음에는 자기 자신을 부모로 설정)
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        // 2. 다리 건설 비용(costs[i][2])을 기준으로 오름차순 정렬
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));

        // 3. 비용이 적은 간선부터 하나씩 확인하며 연결
        int edgesUsed = 0; // 연결된 다리의 개수
        
        for (int[] edge : costs) {
            int node1 = edge[0];
            int node2 = edge[1];
            int cost = edge[2];

            // 최상위 부모가 다르다면 (즉, 사이클이 발생하지 않는다면)
            if (findParent(parent, node1) != findParent(parent, node2)) {
                unionNodes(parent, node1, node2); // 두 섬을 연결
                totalCost += cost;                // 총 비용에 추가
                edgesUsed++;                      // 연결된 다리 개수 증가

                // 모든 섬이 연결되려면 다리의 개수는 항상 (섬의 개수 - 1)개
                if (edgesUsed == n - 1) {
                    break;
                }
            }
        }

        return totalCost;
    }
}
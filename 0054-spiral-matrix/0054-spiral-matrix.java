class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int totalElement = m * n;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int cr = 0;
        int cc = 0;
        int dir = 0;
        
        while (result.size() < totalElement) {
            if (matrix[cr][cc] != 101) {
                result.add(matrix[cr][cc]);
                matrix[cr][cc] = 101;
            }

            int nr = cr + dr[dir];
            int nc = cc + dc[dir];
            if (nr < 0 || nr >= m || nc < 0 || nc >= n || matrix[nr][nc] == 101) {
                dir = (dir + 1) % dr.length;
            }
            cr += dr[dir];
            cc += dc[dir];
        }
        return result;
    }
}
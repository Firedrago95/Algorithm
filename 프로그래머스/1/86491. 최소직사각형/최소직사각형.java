class Solution {
    public int solution(int[][] sizes) {
        int wm = 0;
        int hm = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            
            if (wm < sizes[i][0]) {
                wm = sizes[i][0];
            }
            
            if (hm < sizes[i][1]) {
                hm = sizes[i][1];
            }
        }
        
        return wm * hm;
    }
}
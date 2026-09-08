class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int minH = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                minH = Math.max(minH, (r - l) * height[l]);
                l++;
            } else {
                minH = Math.max(minH, (r - l) * height[r]);
                r--;
            }
        }
        return minH;
    }
}
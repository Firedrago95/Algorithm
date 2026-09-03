class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (start < end) {
            maxLeft = Math.max(maxLeft, height[start]);
            maxRight = Math.max(maxRight, height[end]);

            if (maxLeft < maxRight) {
                totalWater += maxLeft - height[start++];
            } else {
                totalWater += maxRight - height[end--];
            }
        }
        return totalWater;
    }
}
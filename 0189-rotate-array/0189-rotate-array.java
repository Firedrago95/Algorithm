class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }

    public void reverse(int[] nums, int s, int e) {
        int start = s;
        int end = e - 1;

        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
} 
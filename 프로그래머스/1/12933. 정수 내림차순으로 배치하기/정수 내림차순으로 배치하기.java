class Solution {
    public long solution(long n) {
        String input = String.valueOf(n);
        char[] nums = input.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    char temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return Long.parseLong(new String(nums));
    }
}
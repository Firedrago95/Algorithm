class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                answer[0] = l + 1;
                answer[1] = r + 1;
                return answer;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }

        return answer;
    }
}
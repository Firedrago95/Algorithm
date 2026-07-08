class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n + 1];

        for (int c : citations) {
            if (c >= n) {
                arr[n]++;
            } else {
                arr[c]++;
            }
        }

        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += arr[i];
            if (total >= i) return i;
        }
        return 0;
    }
}
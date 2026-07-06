class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int index = m + n - 1;

        while (a >= 0 && b >= 0) {
            if (nums1[a] >= nums2[b]) {
                nums1[index] = nums1[a];
                a--;
                index--;
            } else {
                nums1[index] = nums2[b];
                b--;
                index--;
            }
        }

        while (b >= 0) {
            nums1[index] = nums2[b];
            index--;
            b--;
        }
    }
}
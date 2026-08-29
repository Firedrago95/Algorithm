class Solution {
    public boolean isPalindrome(String s) {
        char[] words = s.trim().toLowerCase().toCharArray();
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            while (left < right && !isAlphaNumeric(words[left])) {
                left++;
            }

            while (left < right && !isAlphaNumeric(words[right])) {
                right--;
            }

            if (words[left] != words[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
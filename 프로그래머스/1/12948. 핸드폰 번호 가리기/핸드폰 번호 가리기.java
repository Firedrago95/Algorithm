class Solution {
    public String solution(String phone_number) {
        char[] numbers = phone_number.toCharArray();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            numbers[i] = '*';
        }
        return new String(numbers);
    }
}
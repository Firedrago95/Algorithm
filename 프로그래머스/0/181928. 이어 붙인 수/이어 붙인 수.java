class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        for (int num : num_list) {
            if (num % 2 == 0) {
                a += num;
            } else {
                b += num;
            }
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
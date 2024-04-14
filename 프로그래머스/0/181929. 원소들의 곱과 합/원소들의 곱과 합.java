class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        double sum = 0;
        
        for (int num : num_list) {
            multiple *= num;
            sum += num;
        }
        sum = Math.pow(sum,2);
        
        if (multiple < sum) {
            return 1;
        } 
        return 0;
    }
}
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] a = new int[end_num - start_num + 1];
        
        for(int i = 0; i <= end_num - start_num; i++){
            a[i] = i + start_num;
        }
        return a;
    }
}
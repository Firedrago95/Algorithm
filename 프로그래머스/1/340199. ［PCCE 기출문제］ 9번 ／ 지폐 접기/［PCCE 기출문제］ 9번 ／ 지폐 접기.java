import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(needFolding(wallet, bill)) {
            bill[1] /= 2;
            answer++;
        }
        return answer;
    }
    
    private boolean needFolding(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);
        return bill[0] > wallet[0] || bill[1] > wallet[1];
    }
}

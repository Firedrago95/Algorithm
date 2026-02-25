import java.util.*;
class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] nc = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            nc[i] = new HashSet();
        }
        
        for (int i = 1; i <= 8; i++) {
            nc[i].add(getSequenceNum(N, i));
            
            for (int k = 1; k < i; k++) {
                int j = i - k;
                
                for (int a : nc[k]) {
                    for (int b : nc[j]) {
                        nc[i].add(a + b);
                        nc[i].add(a - b);
                        nc[i].add(a * b);
                        if (b != 0) nc[i].add(a / b);
                    }
                }
            }
            if (nc[i].contains(number)) return i;
        }
        return -1;
    }
    
    private int getSequenceNum(int N, int k) {
        int num = 0;
        while (k-- > 0) {
            num = num * 10 + N;
        }
        return num;
    }
}
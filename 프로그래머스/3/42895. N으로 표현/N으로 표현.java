import java.util.*;
class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] set = new Set[9];
        
        for (int i = 1; i <= 8; i++) {
            set[i] = new HashSet<>();
        }
        
        for (int i = 1; i <= 8; i++) {
            set[i].add(getNM(N, i));
            
            for (int j = 1; j < i; j++) {
                int k = i - j;
                for (int s : set[j]) {
                    for (int f : set[k]) {
                        set[i].add(f + s);
                        set[i].add(f * s);
                        set[i].add(f - s);
                        if (s != 0) set[i].add(f / s);
                    }
                }
            }
            
            if (set[i].contains(number)) return i;
        }
        return -1;
    }
    
    private int getNM(int N, int count) {
        int a = 0;
        while(count-- > 0) {
            a = a * 10 + N;
        }
        return a;
    }
}
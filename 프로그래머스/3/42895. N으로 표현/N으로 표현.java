import java.util.*;
class Solution {
    public int solution(int N, int number) {
        // 1. N과 number가 일치하면 바로 1 반환
        if (N == number) return 1;
        
        // 2. 8번 까지만 결과 저장하기위한 List<Set<Integer>> 생성
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            list.add(new HashSet<>());
        }
        
        // 3. 단순 N 반복 숫자 초기화
        int targetN = N;
        for (int i = 1; i <= 8; i++) {
            list.get(i).add(targetN);
            targetN = targetN * 10 + N;
        }
        
        // 4. dp식 사용 초기화
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (int op1 : list.get(j)) {
                    for (int op2 : list.get(i - j)) {
                        list.get(i).add(op1 + op2);
                        list.get(i).add(op1 - op2);
                        list.get(i).add(op1 * op2);
                        if (op2 != 0) list.get(i).add(op1 / op2);
                    }
                }
            }
            if (list.get(i).contains(number)) return i;
        }
        return -1;
    }
}
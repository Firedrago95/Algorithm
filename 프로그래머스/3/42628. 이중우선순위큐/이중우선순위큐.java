import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        for (String operation : operations) {
            String[] split = operation.split(" ");
            String c = split[0];
            int num = Integer.parseInt(split[1]);
            
            if (c.equals("I")) {
                tm.put(num, tm.getOrDefault(num, 0) + 1);
            } else {
                if (tm.isEmpty()) continue;
                int targetKey = (num == 1) ? tm.lastKey() : tm.firstKey();
                if (tm.get(targetKey) == 1) {
                    tm.remove(targetKey);
                } else {
                    tm.put(targetKey, tm.get(targetKey) - 1);
                }
            }
        }
        if (tm.isEmpty()) return new int[] {0,0};
        return new int[] {tm.lastKey(), tm.firstKey()};
    }
}
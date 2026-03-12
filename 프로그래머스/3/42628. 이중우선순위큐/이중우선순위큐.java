import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String operation : operations) {
            String[] split = operation.split(" ");
            String command = split[0];
            int num = Integer.parseInt(split[1]);
            
            if (command.equals("I")) {
                map.put(num , map.getOrDefault(num , 0) + 1);
            } else {
                if (map.isEmpty()) continue;
                int target = (num == 1) ? map.lastKey() : map.firstKey();
                if (map.get(target) == 1) {
                    map.remove(target);
                } else {
                    map.put(target, map.get(target) - 1);
                }
            }
        }
        if (map.isEmpty()) return new int[] {0,0};
        return new int[] {map.lastKey(), map.firstKey()};
    }
}
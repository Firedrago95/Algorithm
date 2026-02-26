import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        
        if (map.size() > nums.length / 2) {
            return nums.length / 2;
        }
        
        return map.size();
    }
}
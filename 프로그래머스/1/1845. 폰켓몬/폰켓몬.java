import java.util.*;
class Solution {
    public int solution(int[] nums) {
        // 1. 총 종류의 개수 = nums.length
        int n = nums.length / 2;
        
        // 2. 중복 없는 종류의 개수 set.size()
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int setSize = set.size();

        
        // 2-1 구하려고 하는 개수가 총 종류보다 크거나 같을때 n/2 > set.size()
        // 3개를 구해야 하는데 종류가 2개 => 2개 (set.size())
        if (n >= setSize) return setSize;
        
        // 2-2 구하려고 하는 개수가 총 종류보다 작거나 같을때 n/2 <= set.size()
        // 2개를 구해야 하는데 총 종류가 2개 or 3개 => 2개 (n/2 개)
        return n;
    }
}
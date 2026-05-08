import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] tmp = new int[arr.length];
        int j = 0;
        
        if(arr.length > 0) {
            tmp[j++] = arr[0];
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != tmp[j - 1]) {
                tmp[j++] = arr[i];
            }
        }
        
        return Arrays.copyOf(tmp, j);
    }
}
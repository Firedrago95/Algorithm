import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        // 1. 나가는 지점 오름차순 정렬
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        int lastCamera = -30001;
        for (int[] route : routes) {
            // 현재 카메라가 진입점 보다 앞에 있을경우
            if (lastCamera < route[0]) {
                count++;
                lastCamera = route[1]; // 이 차량이 나가는 지점에 카메라 설치
            }
        }
        return count;
    }
}
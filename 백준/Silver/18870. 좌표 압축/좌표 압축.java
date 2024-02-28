import java.io.*;
import java.lang.reflect.Member;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        int[] origin = new int[N];
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int rank = 0;
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, rank++);
            }
        }
        for (int i : origin) {
            sb.append(count.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
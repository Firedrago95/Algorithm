import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> nums = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        long sum = 0;
        long max = 0;

        for (int num : nums) {
            if (max < num) max = num;
            sum += num;
        }

        System.out.println(sum * 100.0 / max / n);
    }
}

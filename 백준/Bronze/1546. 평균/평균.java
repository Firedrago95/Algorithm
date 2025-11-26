import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double result = 0;

        List<Integer> nums = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < nums.size(); i++) {
            result +=(double) nums.get(i) / nums.get(nums.size() - 1) * 100;
        }

        System.out.println(result / n);
    }
}

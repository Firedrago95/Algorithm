import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        List<Integer> numbers = Arrays.stream(s)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int min = numbers.stream().mapToInt(Integer::valueOf).min().getAsInt();
        int max = numbers.stream().mapToInt(Integer::valueOf).max().getAsInt();

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }
}
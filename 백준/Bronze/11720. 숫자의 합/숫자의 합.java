import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int result = 0;

        String nums = sc.next();
        for (char num : nums.toCharArray()) {
            result += num - '0';
        }
        System.out.println(result);
    }
}

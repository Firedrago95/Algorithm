import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[1000001];
        checkPrime(isPrime);


        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) return;

            for (int i = 3; i < isPrime.length; i = i + 2) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n-i));
                    break;
                }
            }
        }
    }

    private static void checkPrime(boolean[] isPrime) {
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}


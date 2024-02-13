import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int form = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        while (num >= form) {
            result.add(num % form);
            num /= form;
        }
        result.add(num);

        char[] a = new char[result.size()];
        for (int i = 0; i < a.length; i++) {
            if(result.get(result.size() - (i+1)) > 9) {
                a[i] = (char)(result.get(result.size()-(i+1)) + '7');
            } else {
                a[i] = (char)(result.get(result.size()-(i+1)) + '0');
            }
        }
        System.out.println(String.valueOf(a));
    }
}
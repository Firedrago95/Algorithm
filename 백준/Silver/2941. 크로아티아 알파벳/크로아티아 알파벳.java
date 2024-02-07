import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] exception = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = br.readLine();

        for (int i = 0; i < exception.length; i++) {
            if (word.contains(exception[i])) {
                word = word.replace(exception[i], " ");
            }
        }
        System.out.println(word.length());
    }


}
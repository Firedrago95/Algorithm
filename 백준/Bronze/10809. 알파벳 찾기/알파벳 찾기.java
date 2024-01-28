import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
        
        int[] answer = new int[26];
        for (int i=0; i<26; i++) {
            answer[i] = -1;
        }
         
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if (answer[ch - 'a'] == -1) {
                answer[ch - 'a'] = i;
            }
        }
        
        for (int i=0; i<26; i++) {
            System.out.print(answer[i]+" ");
        }
        
        
	}
}
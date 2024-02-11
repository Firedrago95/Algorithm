import java.util.Scanner;
class Solution {
    public String solution(String str1, String str2) {
        char[] result = new char[str1.length() + str2.length()];

        for (int i=0; i< str1.length(); i++) {
            result[2*i] = str1.charAt(i);
        }
        for (int i=0; i<str2.length(); i++) {
            result[2*i+1] = str2.charAt(i);
        }
        return String.valueOf(result);
    }
}
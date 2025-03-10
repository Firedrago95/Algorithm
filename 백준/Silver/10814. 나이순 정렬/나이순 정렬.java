import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            members.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        Collections.sort(members);

        for (Member member : members) {
            bw.write(member.toString());
        }

        br.close();
        bw.close();
    }

    public static class Member implements Comparable<Member> {
        private int age;
        private String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
           return this.age - o.age;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
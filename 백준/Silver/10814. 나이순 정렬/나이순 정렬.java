import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        Member[] a = new Member[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            a[i] = new Member(age, name);
        }
        Arrays.sort(a);

        for (Member member : a) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.println(sb);
    }
}

class Member implements Comparable{
    public int index;
    public int age;
    public String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Member member = null;
        if (o instanceof Member) {
            member = (Member)o;
        }
        if (age == member.age) {
            return index - member.index;
        }
        return age - member.age;
    }
}
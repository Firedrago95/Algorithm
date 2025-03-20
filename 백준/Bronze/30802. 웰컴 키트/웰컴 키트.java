import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 참가자 수를 입력받는다
        int n = Integer.parseInt(br.readLine());
            
        // 티셔츠 사이즈별 신청자 수를 입력받는다
        String[] requestBySize = br.readLine().split(" ");

        // 티셔츠 한묶음 수를 입력받는다
        String[] split = br.readLine().split(" ");
        int t = Integer.parseInt(split[0]);

        // 펜의 한묶음 수를 입력받는다
        int p = Integer.parseInt(split[1]);

        // 티셔츠 묶음 갯수를 구한다
        int shirtsBundleCount = 0;
        for (String request : requestBySize) {
            int count = Integer.parseInt(request);
            shirtsBundleCount += (int) Math.ceil((double) count / t);
        }

        // 펜의 묶음 갯수를 구한다
        int penBundleCount = 0;
        int eachPenCount = 0;

        penBundleCount = n / p;
        eachPenCount = n % p;

        bw.write(shirtsBundleCount + "\n" + penBundleCount + " " + eachPenCount);
        br.close();
        bw.close();
    }
}
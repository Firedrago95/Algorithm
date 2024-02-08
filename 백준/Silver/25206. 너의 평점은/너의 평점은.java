import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        float totalScore = 0f;
        float count = 0f;
        double gradeScore = 0;
        List<String> grades = List.of("A+" ,"A0" ,"B+" ,"B0" ,"C+" ,"C0" ,"D+" ,"D0" ,"F");
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grades.contains(grade)) {
                continue;
            } else {
                gradeScore = 4.5f - (grades.indexOf(grade) * 0.5f);
            }
            if (grade.equals("F")) {
                gradeScore = 0;
            }
            count += (float) score;
            totalScore += (float) (gradeScore * score);
        }
        System.out.println(totalScore / count);
    }
}
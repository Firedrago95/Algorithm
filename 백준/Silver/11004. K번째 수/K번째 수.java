import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, n - 1);
        System.out.println(arr[k-1]);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        int left = start;
        int right = end;

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        if (start < right) {
            quickSort(arr, start, right);
        }
        if (left < end) {
            quickSort(arr, left, end);
        }
    }
}

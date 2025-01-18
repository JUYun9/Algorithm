import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i]))
                sb.append(1 + "\n");
            else
                sb.append(0 + "\n");
        }
        System.out.println(sb);
    }

    public static boolean binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] < num)
                start = mid + 1;
            else if (array[mid] > num)
                end = mid - 1;
            else {
                return true;
            }
        }
        return false;
    }
}
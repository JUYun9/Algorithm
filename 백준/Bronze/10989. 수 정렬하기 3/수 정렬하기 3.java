import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        for (int i = 0; i < testCase; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        for (int i = 0; i < testCase; i++)
            bw.write(arr[i] + "\n");

        bw.flush();
        bw.close();
    }
}
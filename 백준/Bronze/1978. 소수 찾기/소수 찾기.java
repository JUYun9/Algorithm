import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i]))
                count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
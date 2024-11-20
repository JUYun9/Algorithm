import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String newResult = String.valueOf(result);

        int[] count = new int[10];
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        for (int i = 0; i < newResult.length(); i++)
            count[newResult.charAt(i) - '0']++;

        for (int i = 0; i < 10; i++)
            bw.write(count[i] + "\n");


        bw.flush();
        bw.close();
    }
}

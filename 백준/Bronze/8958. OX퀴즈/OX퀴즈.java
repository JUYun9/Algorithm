import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int sum = 0;
            int cnt = 0;
            StringBuilder result = new StringBuilder();
            result.append(br.readLine());
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O')
                    cnt++;
                else
                    cnt = 0;
                sum += cnt;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

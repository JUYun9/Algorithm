import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        StringBuilder result = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            input = br.readLine();

            int leftCount = 0;
            int rightCount = 0;

            char standard = input.charAt(0);
            if (standard == '(')
                leftCount++;
            else {
                rightCount++;
                result.append("NO" + "\n");
                continue;
            }

            for (int j = 1; j < input.length(); j++) {
                if (standard == '(' && leftCount < rightCount)
                    break;

                if (input.charAt(j) == '(')
                    leftCount++;
                else
                    rightCount++;
            }

            if (leftCount == rightCount)
                result.append("YES" + "\n");
            else
                result.append("NO" + "\n");
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
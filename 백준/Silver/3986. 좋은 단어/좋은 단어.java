import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String str = br.readLine();
            Stack<Character> stk = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!stk.isEmpty() && stk.peek() == ch)
                    stk.pop();
                else
                    stk.add(ch);
            }

            if (stk.isEmpty())
                count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
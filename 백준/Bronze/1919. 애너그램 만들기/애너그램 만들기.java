import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] countStr1 = new int[26];
        for (int i = 0; i < str1.length(); i++)
            countStr1[str1.charAt(i) - 'a']++;

        int[] countStr2 = new int[26];
        for (int i = 0; i < str2.length(); i++)
            countStr2[str2.charAt(i) - 'a']++;

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (countStr1[i] != countStr2[i]) {
                result += Math.abs(countStr1[i] - countStr2[i]);
            }
        }
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        int[] positions = new int[alphabet.length];
        Arrays.fill(positions, -1);

        String text = br.readLine();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j].equals(String.valueOf(text.charAt(i))) && positions[j] == -1) {
                    positions[j] = i;
                    break;
                }
            }
        }

        for (int position : positions)
            bw.write(position + " ");

        bw.flush();
        bw.close();
    }
}

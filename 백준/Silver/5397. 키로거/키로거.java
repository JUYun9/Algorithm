import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            LinkedList<String> list = new LinkedList<>();
            ListIterator<String> iterator = list.listIterator();

            String L = br.readLine();
            for (int j = 0; j < L.length(); j++) {
                if (L.charAt(j) == '<') {
                    if (iterator.hasPrevious())
                        iterator.previous();
                } else if (L.charAt(j) == '>') {
                    if (iterator.hasNext())
                        iterator.next();
                } else if (L.charAt(j) == '-') {
                    if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                    }
                } else {
                    iterator.add(String.valueOf(L.charAt(j)));
                }
            }

            bw.write(String.join("", list));
            bw.write("\n");
        }

        bw.close();
    }
}
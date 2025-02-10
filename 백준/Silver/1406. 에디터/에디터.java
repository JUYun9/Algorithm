import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<String> list = new LinkedList<>();

        String str = br.readLine();
        for (char s: str.toCharArray())
            list.add(Character.toString(s));

        ListIterator<String> cursor = list.listIterator(list.size());

        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("P")) {
                cursor.add(st.nextToken());
            }
            else if (command.equals("L")) {
                if (cursor.hasPrevious())
                    cursor.previous();
            }
            else if (command.equals("D")) {
                if (cursor.hasNext())
                    cursor.next();
            }
            else {   // "B"일 때
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            }
        }

        for (String s: list)
            bw.write(s);

        bw.flush();
        bw.close();
    }
}
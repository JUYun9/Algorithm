import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> list = new LinkedList<>();

        String str = br.readLine();
        for (char s: str.toCharArray())
            list.add(s);

        ListIterator<Character> cursor = list.listIterator();
        while (cursor.hasNext())
            cursor.next();

        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("P")) {
                if (st.hasMoreTokens())
                    cursor.add(st.nextToken().charAt(0));
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

        for (Character s: list)
            bw.write(s);

        bw.flush();
        bw.close();
    }
}